package com.dy.service;

import com.dy.bean.Guest;
import com.dy.dao.GuestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description:
 *
 * @author:SunG
 * @date 2021/3/6 1:16
 */
@Service
public class GuestServiceImp implements GuestService {

    @Autowired
    private GuestDao guestDao;
    @Override
    public List<Guest> findAllGuest() {
        return guestDao.findAllGuest();
    }

    @Override
    public void add(Guest guest) {
        guestDao.add(guest);
    }

    @Override
    public Guest findGuestByName(String name) {
        return guestDao.findGuestByName(name);
    }

    @Override
    public void update(Guest guest) {
        guestDao.update(guest);
    }

    @Override
    public void delete(String name) {
        guestDao.delete(name);
    }
}
