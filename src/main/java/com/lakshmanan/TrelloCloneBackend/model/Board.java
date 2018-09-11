
package com.lakshmanan.TrelloCloneBackend.model;

import java.util.List;
import javax.validation.Valid;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "board_id",
    "board_name",
    "board_lists"
})
public class Board {

    @JsonProperty("board_id")
    private Integer boardId;
    @JsonProperty("board_name")
    private String boardName;
    @JsonProperty("board_lists")
    @Valid
    private List<BoardList> boardLists = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Board() {
    }

    /**
     * 
     * @param boardId
     * @param boardName
     * @param boardLists
     */
    public Board(Integer boardId, String boardName, List<BoardList> boardLists) {
        super();
        this.boardId = boardId;
        this.boardName = boardName;
        this.boardLists = boardLists;
    }

    @JsonProperty("board_id")
    public Integer getBoardId() {
        return boardId;
    }

    @JsonProperty("board_id")
    public void setBoardId(Integer boardId) {
        this.boardId = boardId;
    }

    @JsonProperty("board_name")
    public String getBoardName() {
        return boardName;
    }

    @JsonProperty("board_name")
    public void setBoardName(String boardName) {
        this.boardName = boardName;
    }

    @JsonProperty("board_lists")
    public List<BoardList> getBoardLists() {
        return boardLists;
    }

    @JsonProperty("board_lists")
    public void setBoardLists(List<BoardList> boardLists) {
        this.boardLists = boardLists;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("boardId", boardId).append("boardName", boardName).append("boardLists", boardLists).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(boardId).append(boardName).append(boardLists).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Board) == false) {
            return false;
        }
        Board rhs = ((Board) other);
        return new EqualsBuilder().append(boardId, rhs.boardId).append(boardName, rhs.boardName).append(boardLists, rhs.boardLists).isEquals();
    }

}
