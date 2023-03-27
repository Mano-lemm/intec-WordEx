package org.example.woordenboek.models.dtos;

import java.util.List;

public class CreateWordsDTO {
    private List<CreateWordDTO> words;

    public CreateWordsDTO(List<CreateWordDTO> words) {
        this.words = words;
    }

    public CreateWordsDTO() {
    }

    public List<CreateWordDTO> getWords() {
        return this.words;
    }

    public void setWords(List<CreateWordDTO> words) {
        this.words = words;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CreateWordsDTO)) return false;
        final CreateWordsDTO other = (CreateWordsDTO) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$words = this.getWords();
        final Object other$words = other.getWords();
        if (this$words == null ? other$words != null : !this$words.equals(other$words)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof CreateWordsDTO;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $words = this.getWords();
        result = result * PRIME + ($words == null ? 43 : $words.hashCode());
        return result;
    }

    public String toString() {
        return "CreateWordsDTO(words=" + this.getWords() + ")";
    }
}
