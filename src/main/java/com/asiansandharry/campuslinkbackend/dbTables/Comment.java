package com.asiansandharry.campuslinkbackend.dbTables;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table
public class Comment {
    @Id
    private long CommentID;
    /* Foreign Key from Annoucement table */
    private long AnnoucementID;
    /* Foreign Key from Account table */
    private long AccountID;
    private String comment;
    private Date commentDate;

    public Comment() {}

    public Comment(long CommentID, long AnnoucementID, long accountID, String comment, Date commentDate) {
        this.CommentID = CommentID;
        this.AnnoucementID = AnnoucementID;
        this.AccountID = accountID;
        this.comment = comment;
        this.commentDate = commentDate;
    }

    public long getCommentID() {
        return CommentID;
    }

    public void setCommentID(long commentID) {
        CommentID = commentID;
    }

    public long getAnnoucementID() {
        return AnnoucementID;
    }

    public void setAnnoucementID(long annoucementID) {
        AnnoucementID = annoucementID;
    }

    public long getAccountID() {
        return AccountID;
    }

    public void setAccountID(long accountID) {
        this.AccountID = accountID;
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
                ", AnnoucementID='" + AnnoucementID + '\'' +
                ", AccountID='" + AccountID + '\'' +
                ", comment='" + comment + '\'' +
                ", commentDate='" + commentDate + '\'' +
                '}';
    }
}
