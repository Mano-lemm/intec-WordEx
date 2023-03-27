package org.example.woordenboek.models.dtos;

public class GetAllWordsDTO {
    public GetAllWordsDTO() {
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof GetAllWordsDTO)) return false;
        final GetAllWordsDTO other = (GetAllWordsDTO) o;
        if (!other.canEqual((Object) this)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof GetAllWordsDTO;
    }

    public int hashCode() {
        int result = 1;
        return result;
    }

    public String toString() {
        return "GetAllWordsDTO()";
    }
}
