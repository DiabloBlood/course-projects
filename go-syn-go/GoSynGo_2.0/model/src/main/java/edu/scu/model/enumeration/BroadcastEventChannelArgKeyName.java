package edu.scu.model.enumeration;

/**
 * Created by chuanxu on 5/9/16.
 */
public enum BroadcastEventChannelArgKeyName {

    CHANNEL_NAME("channelName"),

    OBJECT_ID("objectId"),

    EVENT_ID("eventId"),

    LEADER_ID("leaderId"),

    EVENT_MANAGEMENT_STATE("eventManagementState"),

    MESSAGE("message"),

    EVENT_TITLE("eventTitle"),

    EVENT_NOTE("eventNote"),

    EVENT_LOCATION("eventLocation"),

    EVENT_LEADER_NAME("eventLeaderName"),

    MEMBER_ID("memberId"),

    EVENT_MEMBER_DETAIL("eventMemberDetail");


    private String keyName;

    BroadcastEventChannelArgKeyName(String keyName) {
        this.keyName = keyName;
    }

    public String getKeyName() {
        return keyName;
    }

}
