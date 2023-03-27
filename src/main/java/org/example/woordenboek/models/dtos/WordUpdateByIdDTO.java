package org.example.woordenboek.models.dtos;

public class WordUpdateByIdDTO {
    private Long id;
    private String word;
    private String translation;

    public WordUpdateByIdDTO(Long id, String word, String translation) {
        this.id = id;
        this.word = word;
        this.translation = translation;
    }

    public WordUpdateByIdDTO() {
    }

    public Long getId() {
        return this.id;
    }

    public String getWord() {
        return this.word;
    }

    public String getTranslation() {
        return this.translation;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof WordUpdateByIdDTO)) return false;
        final WordUpdateByIdDTO other = (WordUpdateByIdDTO) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
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
        return other instanceof WordUpdateByIdDTO;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $word = this.getWord();
        result = result * PRIME + ($word == null ? 43 : $word.hashCode());
        final Object $translation = this.getTranslation();
        result = result * PRIME + ($translation == null ? 43 : $translation.hashCode());
        return result;
    }

    public String toString() {
        return "WordUpdateByIdDTO(id=" + this.getId() + ", word=" + this.getWord() + ", translation=" + this.getTranslation() + ")";
    }
}
