package com.asiansandharry.campuslinkbackend.dbTables;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table
public class Annoucement {
    @Id
    private long AnnoucementID;
    /* Foreign Key from ChatRoom table */
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(columnDefinition = "ChatRoomID")
    private ChatRoom chatRoom;
    /* Foreign Key from Account table */


    private long AccountID;
    private Date datePosted;
    private String annoucementTitle;
    private String annoucementDescription;

    public Annoucement() {}

    public Annoucement(long AnnoucementID, ChatRoom chatRoom, long AccountID, Date datePosted, String annoucementTitle, String annoucementDescription) {
        this.AnnoucementID = AnnoucementID;
        this.chatRoom = chatRoom;
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

    public ChatRoom getChatRoomID() {
        return chatRoom;
    }

    public void setChatRoomID(ChatRoom chatRoomID) {
        chatRoom = chatRoom;
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
                ", ChatRoomID='" + chatRoom + '\'' +
                ", AccountID='" + AccountID + '\'' +
                ", datePosted='" + datePosted + '\'' +
                ", annoucementTitle='" + annoucementTitle + '\'' +
                ", annoucementDescription='" + annoucementDescription + '\'' +
                '}';
    }
}
