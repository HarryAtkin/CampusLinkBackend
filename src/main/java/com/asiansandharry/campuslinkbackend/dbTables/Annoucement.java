package com.asiansandharry.campuslinkbackend.dbTables;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table
public class Annoucement {
    @Id
    private long AnnoucementID;
    /* Foreign Key from ChatRoom table */
    private long ChatRoomID;
    /* Foreign Key from Account table */
    private long AccountID;
    private Date datePosted;
    private String annoucementTitle;
    private String annoucementDescription;

    public Annoucement() {}

    public Annoucement(long AnnoucementID, long ChatRoomID, long AccountID, Date datePosted, String annoucementTitle, String annoucementDescription) {
        this.AnnoucementID = AnnoucementID;
        this.ChatRoomID = ChatRoomID;
        this.AccountID = AccountID;
        this.datePosted = datePosted;
        this.annoucementTitle = annoucementTitle;
        this.annoucementDescription = annoucementDescription;
    }

    public long getAnnoucementID() {
        return AnnoucementID;
    }

    public void setAnnoucementID(long annoucementID) {
        AnnoucementID = annoucementID;
    }

    public long getChatRoomID() {
        return ChatRoomID;
    }

    public void setChatRoomID(long chatRoomID) {
        ChatRoomID = chatRoomID;
    }

    public long getAccountID() {
        return AccountID;
    }

    public void setAccountID(long accountID) {
        AccountID = accountID;
    }

    public Date getDatePosted() {
        return datePosted;
    }

    public void setDatePosted(Date datePosted) {
        this.datePosted = datePosted;
    }

    public String getAnnoucementTitle() {
        return annoucementTitle;
    }

    public void setAnnoucementTitle(String annoucementTitle) {
        this.annoucementTitle = annoucementTitle;
    }

    public String getAnnoucementDescription() {
        return annoucementDescription;
    }

    public void setAnnoucementDescription(String annoucementDescription) {
        this.annoucementDescription = annoucementDescription;
    }

    @Override
    public String toString() {
        return "Annoucement{" +
                "AnnoucementID=" + AnnoucementID +
                ", ChatRoomID='" + ChatRoomID + '\'' +
                ", AccountID='" + AccountID + '\'' +
                ", datePosted='" + datePosted + '\'' +
                ", annoucementTitle='" + annoucementTitle + '\'' +
                ", annoucementDescription='" + annoucementDescription + '\'' +
                '}';
    }
}
