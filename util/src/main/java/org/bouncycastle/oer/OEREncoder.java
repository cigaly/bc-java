package org.bouncycastle.oer;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.bouncycastle.asn1.ASN1Encodable;

public class OEREncoder
{
    public static byte[] toByteArray(ASN1Encodable encodable, OERDefinition.Element oerElement)
        throws IOException
    {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        new OEROutputStream(bos).write(encodable, oerElement);
        bos.flush();
        bos.close();
        return bos.toByteArray();
    }
}
