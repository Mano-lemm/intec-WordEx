package org.example.woordenboek.models.dtos;

import java.util.List;

public class WordsGetAllResponse {
    List<WordGetResponse> responses;

    public WordsGetAllResponse(List<WordGetResponse> responses) {
        this.responses = responses;
    }

    public WordsGetAllResponse() {
    }

    public List<WordGetResponse> getResponses() {
        return this.responses;
    }

    public void setResponses(List<WordGetResponse> responses) {
        this.responses = responses;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof WordsGetAllResponse)) return false;
        final WordsGetAllResponse other = (WordsGetAllResponse) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$responses = this.getResponses();
        final Object other$responses = other.getResponses();
        if (this$responses == null ? other$responses != null : !this$responses.equals(other$responses)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof WordsGetAllResponse;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $responses = this.getResponses();
        result = result * PRIME + ($responses == null ? 43 : $responses.hashCode());
        return result;
    }

    public String toString() {
        return "WordsGetAllResponse(responses=" + this.getResponses() + ")";
    }
}
