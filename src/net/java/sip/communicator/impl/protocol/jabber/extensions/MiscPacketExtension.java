package net.java.sip.communicator.impl.protocol.jabber.extensions;

import org.jitsi.util.StringUtils;

import net.java.sip.communicator.util.*;
/**
 * Jingle misc packet extension
 *
 * @author Martin Sebastian
 */
public class MiscPacketExtension
    extends AbstractPacketExtension
{
   /**
     * The logger of this class.
     */
    private static final Logger logger
        = Logger.getLogger(MiscPacketExtension.class);
	
    /**
     * The name of the "misc" element.
     */
    public static final String ELEMENT_NAME = "data";

    /**
     * The namespace for the "misc" element.
     */
    public static final String NAMESPACE = "urn:xmpp:comcast:info";

    /**
     * The name of the "event" argument.
     */
    public static final String EVENT_ATTR_NAME = "event";

    /**
     * The name of the "traceid" argument.
     */
    public static final String TRACEID_ATTR_NAME = "traceid";

    /**
     * The name of the "rootNodeId" argument.
     */
    public static final String ROOT_NODEID_ATTR_NAME = "rootnodeid";
   
    /**
     * The name of the "childNodeid" argument.
     */
    public static final String CHILD_NODEID_ATTR_NAME = "childnodeid";

    /**
     * The name of the "host" argument.
     */
    public static final String HOST_ATTR_NAME = "host";
    public static final String TO_ROUTING_ID_ATTR_NAME = "toroutingid";    
    
    /**
     * The name of the "roomToken" argument.
     */
    public static final String ROOM_TOKEN_ATTR_NAME = "roomtoken";
    
   /**
     * The name of the "childNodeid" argument.
     */
    public static final String ROOM_TOKEN_EXPIRY_TIME_ATTR_NAME = "roomtokenexpirytime";
    /**
     * Creates a new <tt>MiscPacketExtension</tt>. instance with only required
     * parameters.
     *
     * @param creator indicates which party originally generated the content
     * type
     * @param disposition indicates how the content definition is to be
     * interpreted by the recipient
     * @param name the content type according to the creator
     * @param senders the parties in the session will be generating content.
     */
/*    public MiscPacketExtension(String event, String traceId, String rootNodeId, String childNodeId, String host)
    {
        super(NAMESPACE, ELEMENT_NAME);
        if(!StringUtils.isNullOrEmpty(event))
            super.setAttribute(EVENT_ATTR_NAME, event);
        if(!StringUtils.isNullOrEmpty(traceId))
            super.setAttribute(TRACEID_ATTR_NAME, traceId);
        if(!StringUtils.isNullOrEmpty(rootNodeId))
            super.setAttribute(ROOT_NODEID_ATTR_NAME, rootNodeId);
        if(!StringUtils.isNullOrEmpty(childNodeId))
            super.setAttribute(CHILD_NODEID_ATTR_NAME, childNodeId);
        if(!StringUtils.isNullOrEmpty(host))
            super.setAttribute(HOST_ATTR_NAME, host);
    }*/
     public MiscPacketExtension(String event, String traceId, String rootNodeId, String childNodeId, String host ,String toRoutingId, String roomToken, String roomTokenExpiryTime)
    {
        super(NAMESPACE, ELEMENT_NAME);
        if(!StringUtils.isNullOrEmpty(event))
            super.setAttribute(EVENT_ATTR_NAME, event);
        if(!StringUtils.isNullOrEmpty(traceId))
            super.setAttribute(TRACEID_ATTR_NAME, traceId);
        if(!StringUtils.isNullOrEmpty(rootNodeId))
            super.setAttribute(ROOT_NODEID_ATTR_NAME, rootNodeId);
        if(!StringUtils.isNullOrEmpty(childNodeId))
            super.setAttribute(CHILD_NODEID_ATTR_NAME, childNodeId);
        if(!StringUtils.isNullOrEmpty(host))
            super.setAttribute(HOST_ATTR_NAME, host);
	 if(!StringUtils.isNullOrEmpty(toRoutingId))
            super.setAttribute(TO_ROUTING_ID_ATTR_NAME,toRoutingId);
        if(!StringUtils.isNullOrEmpty(roomToken))
            super.setAttribute(ROOM_TOKEN_ATTR_NAME, roomToken);
        if(!StringUtils.isNullOrEmpty(roomTokenExpiryTime))
            super.setAttribute(ROOM_TOKEN_EXPIRY_TIME_ATTR_NAME, roomTokenExpiryTime);

    }
  
    /**
     * Gets the event.
     *
     * @return the event
     */
    public String getEvent()
    {
        return getAttributeAsString(EVENT_ATTR_NAME);
    }
    
    public String getToRoutingId()
    {
	return getAttributeAsString(TO_ROUTING_ID_ATTR_NAME);
    }

    public void setToRoutingId(String toRoutingId)
    {
	setAttribute(TO_ROUTING_ID_ATTR_NAME,toRoutingId);
    }
    /**
     * Sets the event.
     *
     * @param event the new event
     */
    public void setEvent(String event)
    {
        setAttribute(EVENT_ATTR_NAME, event);
    }

    /**
     * Gets the trace id.
     *
     * @return the trace id
     */
    public String getTraceId()
    {
        return getAttributeAsString(TRACEID_ATTR_NAME);
    }

    /**
     * Sets the trace id.
     *
     * @param traceId the new trace id
     */
    public void setTraceId(String traceId)
    {
        setAttribute(TRACEID_ATTR_NAME, traceId);
    }

    /**
     * Gets the root node id.
     *
     * @return the root node id
     */
    public String getRootNodeId()
    {
        return getAttributeAsString(ROOT_NODEID_ATTR_NAME);
    }
    /**
     * Gets the child  node id.
     *
     * @return the child node id
     */
    public String getChildNodeId()
    {
        return getAttributeAsString(CHILD_NODEID_ATTR_NAME);
    }
    /**
     * Gets the host.
     *
     * @return the host
     */
    public String getHost()
    {
        return getAttributeAsString(HOST_ATTR_NAME);
    }
    /**
     * Gets the room token.
     *
     * @return the room token
     */
    public String getRoomToken()
    {
        return getAttributeAsString(ROOM_TOKEN_ATTR_NAME);
    }
    /**
     * Gets the room token expiry time.
     *
     * @return the room token expiry time
     */
    public String getRoomTokenExpiryTime()
    {
        return getAttributeAsString(ROOM_TOKEN_EXPIRY_TIME_ATTR_NAME);
    }
    
    /**
     * Sets the root node id.
     *
     * @param rootNodeId the new node id
     */
    public void setRootNodeId(String rootNodeId)
    {
        setAttribute(ROOT_NODEID_ATTR_NAME, rootNodeId);
    }
    /**
     * Sets the child node id.
     *
     * @param childNodeId the new node id
     */
    public void setChildNodeId(String childNodeId)
    {
        setAttribute(CHILD_NODEID_ATTR_NAME, childNodeId);
    }
    /**
     * Sets the host id.
     *
     * @param host name
     */
    public void setHost(String host)
    {
        setAttribute(HOST_ATTR_NAME, host);
    }
    /**
     * Sets the room token.
     *
     * @param roomToken the new node id
     */
    public void setRoomToken(String roomToken)
    {
        setAttribute(ROOM_TOKEN_ATTR_NAME, roomToken);
    }
    /**
     * Sets the room token expiry time.
     *
     * @param roomTokenExpiryTime the new node id
     */
    public void setRoomTokenExpiryTime(String roomTokenExpiryTime)
    {
        setAttribute(ROOM_TOKEN_EXPIRY_TIME_ATTR_NAME, roomTokenExpiryTime);
    }

}
