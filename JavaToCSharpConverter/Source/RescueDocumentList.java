package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueDocumentList.java

    Rod Hanks   June 2007

******************************************************************/
public class RescueDocumentList extends RescueHistoryObject
{
  public RescueDocumentList(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public long Count64()
	{
	  return Count1(nativeNdx);
	}

  public int Count()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(Count64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public RescueDocument NthRescueDocument(long zeroBasedIndex)
	{
	  long returnNdx = NthRescueDocument2(nativeNdx, zeroBasedIndex);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueDocument myReturn = new RescueDocument(returnNdx);
      return myReturn;
    }
	}
                                // Never directly delete a RescueDocument object.
  public java.lang.String[] UniqueMetaKeys()
	{
    return UniqueMetaKeys3(nativeNdx);
	}
															 // This is expensive so don't do it iteratively.
	public RescueDocument NthDocumentWithKey(long zeroBasedIndex, java.lang.String keyToFind)
	{
	  long returnNdx = NthDocumentWithKey4(nativeNdx, zeroBasedIndex, keyToFind);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueDocument myReturn = new RescueDocument(returnNdx);
      return myReturn;
    }
	}
                                // May return null.
  public boolean RemoveDocument(RescueDocument toRemove)
	{
	  if (toRemove != null)
		{
	    return RemoveDocument5(nativeNdx, toRemove.nativeNdx);
		}
		else
		{
			return false;
		}
	}
															 // Archive model afterwards.  The toRemove argument is disposed.

  private native long Count1(long refNdx);
	private native long NthRescueDocument2(long refNdx, long zeroBasedIndex);
	private native java.lang.String[] UniqueMetaKeys3(long refNdx);
	private native long NthDocumentWithKey4(long refNdx, long zeroBasedIndex, java.lang.String keyToFind);
	private native boolean RemoveDocument5(long refNdx, long docNdx);
}

