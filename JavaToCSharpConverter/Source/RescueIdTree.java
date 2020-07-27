package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueIdTree.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueIdTree extends RjniBaseClass
{


  protected RescueIdTree(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueIdTree()
  {
    nativeNdx = Create_RescueIdTree0();
  }

  public void dispose()
  {
    Delete_RescueIdTree(nativeNdx);
  }

  public void Add(RescueObject newObject)
  {
    Add2(nativeNdx
        ,(newObject == null) ? 0 : newObject.nativeNdx);
  }

  public boolean Delete(RescueObject existingObject)
  {
    boolean myReturn = Delete3(nativeNdx
                                 ,(existingObject == null) ? 0 : existingObject.nativeNdx);
    return myReturn;
  }

  public RescueObject Find(long identifier)
  {
    long returnNdx = Find4(nativeNdx
                           ,identifier);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueObject myReturn = new RescueObject(returnNdx);
      return myReturn;
    }
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

  private native long Create_RescueIdTree0();
  private native void Delete_RescueIdTree(long ndx);
  private native void Add2(long refNdx
                          ,long newObject);
  private native boolean Delete3(long refNdx
                                ,long existingObject);
  private native long Find4(long refNdx
                            ,long identifier);
  private native long Count5(long refNdx);
}
