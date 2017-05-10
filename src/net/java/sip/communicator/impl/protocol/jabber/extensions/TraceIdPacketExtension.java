package net.java.sip.communicator.impl.protocol.jabber.extensions;

/**
 * Jingle trace-id packet extension
 *
 * @author Martin Sebastian
 */
public class TraceIdPacketExtension
    extends AbstractPacketExtension
{
    /**
     * The name of the "trace-id" element.
     */
    public static final String ELEMENT_NAME = "trace-id";

    /**
     * The namespace for the "trace-id" element.
     */
    public static final String NAMESPACE = null;
    
    /**
     * Creates a new {@link TraceIdPacketExtension} instance with the proper
     * element name and namespace.
     */
    public TraceIdPacketExtension()
    {
        super(NAMESPACE, ELEMENT_NAME);
    }

    /**
     * Sets traceId to the TraceIdPacketExtension created.
     *
     * @param contents the contents of this group.
     */
    public void addTraceId(String traceId)
    {
        setText(traceId);
    }
    
    /**
     * Return new trace-id packet extension instance.
     */
    public static TraceIdPacketExtension createTraceIdExtension(String traceId)
    {
        TraceIdPacketExtension ext = new TraceIdPacketExtension();

        ext.addTraceId(traceId);

        return ext;
    }
}
