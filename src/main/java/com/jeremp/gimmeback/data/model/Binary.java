
package com.jeremp.gimmeback.data.model;

/**
 * Holds binary object (avatar, stuff's pictures...)
 * @author jeremp
 */
public class Binary {
    
    private String id ;
    private long length ;
    private String mimeType ;
    private byte[] bytes ;

    public Binary() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public byte[] getBytes() {
        return bytes;
    }

    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }
    
}
