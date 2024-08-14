package com.example.LLD.Splitwise.group;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.LLD.Splitwise.expense.Expense;
import com.example.LLD.Splitwise.group.Group;
import com.example.LLD.Splitwise.user.User;

public class GroupController {

    private GroupController() {}
    public static GroupController groupController = null;
    public static GroupController getInstance() {
        if(groupController == null) {
            synchronized (GroupController.class) {
                if(groupController == null) {
                    return new GroupController();
                }
            }
        }
        return groupController;
    }
    List<Group> groupList = new ArrayList<>();

    //CRUd operations of group
    Map<Integer, Group> groupMap = new HashMap<>();

    public Group createGroup(int groupId, String groupName) {
        Group group = new Group(groupId, groupName);
        groupMap.put(groupId,group);

        return group;
    }

    public void addUser(int groupId, User user) {
        Group group = groupMap.get(groupId);
        group.getUsers().add(user);
        groupMap.put(groupId,group);
    }

    public void addExpense(int groupId, Expense expense) {
        Group group = groupMap.get(groupId);
        group.getExpenseList().add(expense);
        groupMap.put(groupId,group);
    }

}
