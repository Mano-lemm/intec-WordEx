package org.example.woordenboek.models.dtos;

public class CreateWordDTO {
    private String word;
    private String translation;

    public CreateWordDTO(String word, String translation) {
        this.word = word;
        this.translation = translation;
    }

    public CreateWordDTO() {
    }

    public String getWord() {
        return this.word;
    }

    public String getTranslation() {
        return this.translation;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CreateWordDTO)) return false;
        final CreateWordDTO other = (CreateWordDTO) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$word = this.getWord();
        final Object other$word = other.getWord();
        if (this$word == null ? other$word != null : !this$word.equals(other$word)) return false;
        final Object this$translation = this.getTranslation();
        final Object other$translation = other.getTranslation();
        if (this$translation == null ? other$translation != null : !this$translation.equals(other$translation))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof CreateWordDTO;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $word = this.getWord();
        result = result * PRIME + ($word == null ? 43 : $word.hashCode());
        final Object $translation = this.getTranslation();
        result = result * PRIME + ($translation == null ? 43 : $translation.hashCode());
        return result;
    }

    public String toString() {
        return "CreateWordDTO(word=" + this.getWord() + ", translation=" + this.getTranslation() + ")";
    }
}