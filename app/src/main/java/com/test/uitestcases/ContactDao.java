package com.test.uitestcases;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface ContactDao {

    @Insert
    public void insert(Contact... contacts);

    @Update
    public void update(Contact... contacts);

    @Delete
    public void delete(Contact contacts);

    @Query("SELECT * FROM contact")
    List<Contact> getContacts();

    @Query("SELECT * FROM contact WHERE phoneNumber = :number")
    public Contact getContactFromPhoneNumber(String number);

}
