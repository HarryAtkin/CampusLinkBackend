package com.asiansandharry.campuslinkbackend.dbTables;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table
public class Comment {
    @Id
    private long CommentID;
    /* Foreign Key from Annoucement table */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(columnDefinition = "ChatRoomID")
    private ChatRoom ChatRoom;
    /* Foreign Key from Account table */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(columnDefinition = "accountid")
    private Account Account;
    private String comment;
    private Date commentDate;

    public Comment() {}

    public Comment(long CommentID, ChatRoom ChatRoom, Account Account, String comment, Date commentDate) {
        this.CommentID = CommentID;
        this.ChatRoom = ChatRoom;
        this.Account = Account;
        this.comment = comment;
        this.commentDate = commentDate;
    }

    public long getCommentID() {
        return CommentID;
    }

    public void setCommentID(long commentID) {
        CommentID = commentID;
    }

    public ChatRoom getChatRoom() {
        return ChatRoom;
    }

    public void setChatRoom(ChatRoom ChatRoom) {
        ChatRoom = ChatRoom;
    }

    public Account getAccountID() {
        return Account;
    }

    public void setAccountID(Account account) {
        this.Account = account;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getCommentDate() {
        return commentDate;
    }

    public void setCommentDate(Date commentDate) {
        this.commentDate = commentDate;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "CommentID=" + CommentID +
                ", ChatRoom='" + ChatRoom + '\'' +
                ", Account='" + Account + '\'' +
                ", comment='" + comment + '\'' +
                ", commentDate='" + commentDate + '\'' +
                '}';
    }
}
