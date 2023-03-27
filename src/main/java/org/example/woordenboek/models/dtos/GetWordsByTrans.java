package org.example.woordenboek.models.dtos;

public class GetWordsByTrans {
    private String translation;

    public GetWordsByTrans(String translation) {
        this.translation = translation;
    }

    public GetWordsByTrans() {
    }

    public String getTranslation() {
        return this.translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof GetWordsByTrans)) return false;
        final GetWordsByTrans other = (GetWordsByTrans) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$translation = this.getTranslation();
        final Object other$translation = other.getTranslation();
        if (this$translation == null ? other$translation != null : !this$translation.equals(other$translation))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof GetWordsByTrans;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $translation = this.getTranslation();
        result = result * PRIME + ($translation == null ? 43 : $translation.hashCode());
        return result;
    }

    public String toString() {
        return "GetWordsByTrans(translation=" + this.getTranslation() + ")";
    }
}
