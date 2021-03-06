package mysecureshell.tests.protocol.objects;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class SftpFileExtend
{
	public String 	extension;
	public byte[]	data;
	
	public SftpFileExtend()
	{
		;
	}
	
	public SftpFileExtend(String extension, byte[] data)
	{
		this.extension = extension;
		this.data = data;
	}
	
	@Override
	public int hashCode()
	{
		return new HashCodeBuilder()
			.append(extension)
			.append(data)
			.toHashCode();
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == null) return false;
		if (obj == this) return true;
		if (obj.getClass() != getClass()) return false;

		SftpFileExtend o = (SftpFileExtend) obj;
		return new EqualsBuilder()
			.append(extension, o.extension)
			.append(data, o.data)
			.isEquals();
	}
	
	@Override
	public String toString()
	{
		return new ToStringBuilder(this)
			.append("extension", extension)
			.append("data", data)
			.toString();
	}
}
