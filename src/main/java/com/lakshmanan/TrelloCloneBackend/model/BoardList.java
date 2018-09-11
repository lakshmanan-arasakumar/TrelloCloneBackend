
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
    "list_id",
    "list_name",
    "items"
})
public class BoardList {

    @JsonProperty("list_id")
    private Integer listId;
    @JsonProperty("list_name")
    private String listName;
    @JsonProperty("items")
    @Valid
    private List<String> items = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public BoardList() {
    }

    /**
     * 
     * @param listName
     * @param items
     * @param listId
     */
    public BoardList(Integer listId, String listName, List<String> items) {
        super();
        this.listId = listId;
        this.listName = listName;
        this.items = items;
    }

    @JsonProperty("list_id")
    public Integer getListId() {
        return listId;
    }

    @JsonProperty("list_id")
    public void setListId(Integer listId) {
        this.listId = listId;
    }

    @JsonProperty("list_name")
    public String getListName() {
        return listName;
    }

    @JsonProperty("list_name")
    public void setListName(String listName) {
        this.listName = listName;
    }

    @JsonProperty("items")
    public List<String> getItems() {
        return items;
    }

    @JsonProperty("items")
    public void setItems(List<String> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("listId", listId).append("listName", listName).append("items", items).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(listName).append(items).append(listId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BoardList) == false) {
            return false;
        }
        BoardList rhs = ((BoardList) other);
        return new EqualsBuilder().append(listName, rhs.listName).append(items, rhs.items).append(listId, rhs.listId).isEquals();
    }

}
