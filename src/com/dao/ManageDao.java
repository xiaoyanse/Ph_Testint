package com.dao;

import java.util.List;

import com.entity.Manage;

public interface ManageDao {
    public boolean login(String name,String pwd); 		//��¼  
    public boolean register(Manage user); 		//ע��  
    public List<Manage> getUserAll();		//�����û���Ϣ����  
    public boolean delete(int id) ;		//����idɾ���û�  
    public boolean update(int id,String name, String pwd,String sex, String home,String info) ;		//�����û���Ϣ
}
