using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueDocumentList : RescueHistoryObject
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
  public string[] UniqueMetaKeys()
	{
    return UniqueMetaKeys3(nativeNdx);
	}
															 // This is expensive so don't do it iteratively.
	public RescueDocument NthDocumentWithKey(long zeroBasedIndex, string keyToFind)
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
  public bool RemoveDocument(RescueDocument toRemove)
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

}


}