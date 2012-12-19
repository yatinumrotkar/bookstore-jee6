package de.spqrinfo.bookstore.backend.entity;

// PA provides only two ways to deal with enums, by their name or by their ordinal.
// And the standard JPA doesn't support custom types.
// http://stackoverflow.com/questions/2751733/map-enum-in-jpa-with-fixed-values
public enum BookImageType {
    CONVER_SMALL, COVER_NORMAL
}
