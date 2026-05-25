package user.domain.vo;

/**
 * Value Object representing a validated postal address.
 * @since 1.0
 */
public record UserAddress(String street, String city, String zip, String country) {

    /**
     * Creates a new {@code UserAddress} after validating all fields.
     *
     * @param street  the street name and number
     * @param city    the city name
     * @param zip     the postal / zip code
     * @param country the country name
     * @throws IllegalArgumentException if any field is null or blank
     */
    public UserAddress(String street, String city, String zip, String country) {
        if (street == null || street.isBlank()) {
            throw new IllegalArgumentException("La calle no puede estar vacía");
        }
        if (city == null || city.isBlank()) {
            throw new IllegalArgumentException("La ciudad no puede estar vacía");
        }
        if (zip == null || zip.isBlank()) {
            throw new IllegalArgumentException("El código postal no puede estar vacío");
        }
        if (country == null || country.isBlank()) {
            throw new IllegalArgumentException("El país no puede estar vacío");
        }
        this.street = street.trim();
        this.city = city.trim();
        this.zip = zip.trim();
        this.country = country.trim();
    }
}
