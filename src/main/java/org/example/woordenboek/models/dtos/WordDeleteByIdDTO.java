package org.example.woordenboek.models.dtos;

public class WordDeleteByIdDTO {
    private Long id;

    public WordDeleteByIdDTO(Long id) {
        this.id = id;
    }

    public WordDeleteByIdDTO() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof WordDeleteByIdDTO)) return false;
        final WordDeleteByIdDTO other = (WordDeleteByIdDTO) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof WordDeleteByIdDTO;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        return result;
    }

    public String toString() {
        return "WordDeleteByIdDTO(id=" + this.getId() + ")";
    }
}
