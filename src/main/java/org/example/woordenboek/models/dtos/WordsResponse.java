package org.example.woordenboek.models.dtos;

import java.util.List;

public class WordsResponse {
    private List<Long> ids;

    public WordsResponse(List<Long> ids) {
        this.ids = ids;
    }

    public WordsResponse() {
    }

    public List<Long> getIds() {
        return this.ids;
    }

    public void setIds(List<Long> ids) {
        this.ids = ids;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof WordsResponse)) return false;
        final WordsResponse other = (WordsResponse) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$ids = this.getIds();
        final Object other$ids = other.getIds();
        if (this$ids == null ? other$ids != null : !this$ids.equals(other$ids)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof WordsResponse;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $ids = this.getIds();
        result = result * PRIME + ($ids == null ? 43 : $ids.hashCode());
        return result;
    }

    public String toString() {
        return "WordsResponse(ids=" + this.getIds() + ")";
    }
}
