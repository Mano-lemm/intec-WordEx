package org.example.woordenboek.models.dtos;

public class GetWordsByWord {
    private String word;

    public GetWordsByWord(String word) {
        this.word = word;
    }

    public GetWordsByWord() {
    }

    public String getWord() {
        return this.word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof GetWordsByWord)) return false;
        final GetWordsByWord other = (GetWordsByWord) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$word = this.getWord();
        final Object other$word = other.getWord();
        if (this$word == null ? other$word != null : !this$word.equals(other$word)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof GetWordsByWord;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $word = this.getWord();
        result = result * PRIME + ($word == null ? 43 : $word.hashCode());
        return result;
    }

    public String toString() {
        return "GetWordsByWord(word=" + this.getWord() + ")";
    }
}
