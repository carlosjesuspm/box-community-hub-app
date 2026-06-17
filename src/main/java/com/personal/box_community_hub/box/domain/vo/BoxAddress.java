package com.personal.box_community_hub.box.domain.vo;

/**
 * Value Object representing a validated box postal address.
 *
 * @since 1.0
 */
public record BoxAddress(String street, String city, String zip, String country) {

    /**
     * Creates a new {@code BoxAddress} after validating all fields.
     *
     * @param street  the street name and number
     * @param city    the city name
     * @param zip     the postal / zip code
     * @param country the country name
     * @throws IllegalArgumentException if any field is null or blank
     */
    public BoxAddress {
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
        street = street.trim();
        city = city.trim();
        zip = zip.trim();
        country = country.trim();
    }
}
