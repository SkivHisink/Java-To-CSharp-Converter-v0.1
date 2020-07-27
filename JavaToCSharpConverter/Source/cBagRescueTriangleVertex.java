package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    cBagRescueTriangleVertex.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class cBagRescueTriangleVertex extends RjniBaseClass
{


  protected cBagRescueTriangleVertex(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public cBagRescueTriangleVertex()
  {
    nativeNdx = Create_cBagRescueTriangleVertex0();
  }

  public void dispose()
  {
    Delete_cBagRescueTriangleVertex(nativeNdx);
  }

  public void AddTo(RescueTriangleVertex newObject)
  {
    AddTo2(nativeNdx
               ,(newObject == null) ? 0 : newObject.nativeNdx);
  }

  public boolean RemoveFrom(RescueTriangleVertex existingObject)
  {
    boolean myReturn = RemoveFrom3(nativeNdx
                                     ,(existingObject == null) ? 0 : existingObject.nativeNdx);
    return myReturn;
  }

  public RescueTriangleVertex NthObject(long ordinal)
  {
    long returnNdx = NthObject4(nativeNdx
                                ,ordinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueTriangleVertex myReturn = new RescueTriangleVertex(returnNdx);
      return myReturn;
    }
  }

  public RescueTriangleVertex NthObject(int ordinal)
  {
    return NthObject((long) ordinal);
  }

  public long Count64()
  {
    long myReturn = Count5(nativeNdx);
    return myReturn;
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

  public int Count(boolean throwIfTooBig) throws RuntimeException
  {
    return RescueContext.Return32For64(Count64(), throwIfTooBig);
  }

  private native long Create_cBagRescueTriangleVertex0();
  private native void Delete_cBagRescueTriangleVertex(long ndx);
  private native void AddTo2(long refNdx
                                 ,long newObject);
  private native boolean RemoveFrom3(long refNdx
                                    ,long existingObject);
  private native long NthObject4(long refNdx
                                 ,long ordinal);
  private native long Count5(long refNdx);
}
