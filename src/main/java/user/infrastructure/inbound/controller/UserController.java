package user.infrastructure.inbound.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import shared.dto.UserDto;
import user.application.create.CreateUserCase;
import user.application.delete.DeleteUserCase;
import user.application.find.FindUserCase;
import user.domain.User;
import user.domain.vo.UserRole;
import user.infrastructure.inbound.mapper.UserDtoMapper;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
@Tag(name = "User", description = "Endpoints para la gestión de usuarios del sistema")
public class UserController {

    private final CreateUserCase postCreateUser;
    private final FindUserCase getUser;
    private final DeleteUserCase deleteUser;

    @PostMapping(value = "/save", version = "1")
    @Operation(summary = "Crear un nuevo usuario", description = "Registra un nuevo usuario en el sistema con todos sus datos")
    @ApiResponses({
        @ApiResponse(responseCode = "201", description = "Usuario creado correctamente"),
        @ApiResponse(responseCode = "400", description = "Datos de usuario inválidos")
    })
    public ResponseEntity<UserDto> saveUser(@RequestBody User user) {
        UserDto dto = UserDtoMapper.fromUserToDto(postCreateUser.createUser(user));
        return ResponseEntity.status(HttpStatus.CREATED).body(dto);
    }

    @GetMapping(version = "1")
    @Operation(summary = "Listar todos los usuarios", description = "Obtiene una lista completa de todos los usuarios registrados")
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Lista de usuarios obtenida correctamente")
    })
    public ResponseEntity<List<UserDto>> findAll() {
        List<UserDto> dtos = getUser.findAll().stream()
                .map(UserDtoMapper::fromUserToDto)
                .toList();
        return ResponseEntity.ok(dtos);
    }

    @GetMapping(value = "/{id}", version = "1")
    @Operation(summary = "Buscar usuario por ID", description = "Obtiene un usuario a partir de su identificador único (UUID)")
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Usuario encontrado"),
        @ApiResponse(responseCode = "404", description = "Usuario no encontrado")
    })
    public ResponseEntity<UserDto> findById(@PathVariable UUID id) {
        UserDto dto = UserDtoMapper.fromUserToDto(getUser.findById(id));
        return ResponseEntity.ok(dto);
    }

    @GetMapping(value = "/email", version = "1")
    @Operation(summary = "Buscar usuario por email", description = "Obtiene un usuario a partir de su dirección de correo electrónico")
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Usuario encontrado"),
        @ApiResponse(responseCode = "404", description = "Email no encontrado")
    })
    public ResponseEntity<UserDto> findByEmail(@RequestParam String email) {
        UserDto dto = UserDtoMapper.fromUserToDto(getUser.findByEmail(email));
        return ResponseEntity.ok(dto);
    }

    @GetMapping(value = "/role", version = "1")
    @Operation(summary = "Buscar usuarios por rol", description = "Obtiene todos los usuarios que pertenecen a un rol específico (ADMIN, COACH, MEMBER, GUEST)")
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Usuarios encontrados"),
        @ApiResponse(responseCode = "400", description = "Rol inválido")
    })
    public ResponseEntity<List<UserDto>> findByRole(@RequestParam  UserRole role) {
        List<UserDto> dtos = getUser.findByRole(role).stream()
                .map(UserDtoMapper::fromUserToDto)
                .toList();
        return ResponseEntity.ok(dtos);
    }

    @GetMapping(value = "/name", version = "1")
    @Operation(summary = "Buscar usuarios por nombre", description = "Obtiene todos los usuarios cuyo nombre de usuario contenga el texto indicado")
    @ApiResponses({
        @ApiResponse(responseCode = "200", description = "Usuarios encontrados"),
        @ApiResponse(responseCode = "400", description = "Parámetro de búsqueda inválido")
    })
    public ResponseEntity<List<UserDto>> findByName(@RequestParam String name) {
        List<UserDto> dtos = getUser.findByName(name).stream()
                .map(UserDtoMapper::fromUserToDto)
                .toList();
        return ResponseEntity.ok(dtos);
    }

    @DeleteMapping(value = "/{id}", version = "1")
    @Operation(summary = "Eliminar usuario por ID", description = "Elimina un usuario del sistema a partir de su identificador único")
    @ApiResponses({
        @ApiResponse(responseCode = "204", description = "Usuario eliminado correctamente"),
        @ApiResponse(responseCode = "404", description = "Usuario no encontrado")
    })
    public ResponseEntity<Void> deleteById(@PathVariable UUID id) {
        deleteUser.delete(getUser.findById(id));
        return ResponseEntity.noContent().build();
    }
}
