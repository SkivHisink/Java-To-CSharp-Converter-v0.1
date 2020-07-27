package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    cSetRescueHistory.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class cSetRescueHistory extends RjniBaseClass
{


  protected cSetRescueHistory(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public cSetRescueHistory()
  {
    nativeNdx = Create_cSetRescueHistory0();
  }

  public void dispose()
  {
    Delete_cSetRescueHistory(nativeNdx);
  }

  public void AddTo(RescueHistory newObject)
  {
    AddTo2(nativeNdx
               ,(newObject == null) ? 0 : newObject.nativeNdx);
  }

  public boolean RemoveFrom(RescueHistory existingObject)
  {
    boolean myReturn = RemoveFrom3(nativeNdx
                                     ,(existingObject == null) ? 0 : existingObject.nativeNdx);
    return myReturn;
  }

  public boolean RemoveFrom(long ndx)
  {
    boolean myReturn = RemoveFrom4(nativeNdx
                                     ,ndx);
    return myReturn;
  }

  public boolean RemoveFrom(int ndx)
  {
    return RemoveFrom((long) ndx);
  }

  public RescueHistory NthObject(long ordinal)
  {
    long returnNdx = NthObject5(nativeNdx
                                ,ordinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueHistory myReturn = new RescueHistory(returnNdx);
      return myReturn;
    }
  }

  public RescueHistory NthObject(int ordinal)
  {
    return NthObject((long) ordinal);
  }

  public RescueHistory ObjectIdentifiedBy(long identifier)
  {
    long returnNdx = ObjectIdentifiedBy6(nativeNdx
                                         ,identifier);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueHistory myReturn = new RescueHistory(returnNdx);
      return myReturn;
    }
  }

  public RescueHistory ObjectIdentifiedBy(int identifier)
  {
    return ObjectIdentifiedBy((long) identifier);
  }

  public long Count64()
  {
    long myReturn = Count7(nativeNdx);
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

  public void EmptySelf()
  {
    EmptySelf8(nativeNdx);
  }

  public void Relink(RescueObject parent)
  {
    Relink11(nativeNdx
           ,(parent == null) ? 0 : parent.nativeNdx);
  }

  private native long Create_cSetRescueHistory0();
  private native void Delete_cSetRescueHistory(long ndx);
  private native void AddTo2(long refNdx
                                 ,long newObject);
  private native boolean RemoveFrom3(long refNdx
                                    ,long existingObject);
  private native boolean RemoveFrom4(long refNdx
                                    ,long ndx);
  private native long NthObject5(long refNdx
                                 ,long ordinal);
  private native long ObjectIdentifiedBy6(long refNdx
                                          ,long identifier);
  private native long Count7(long refNdx);
  private native void EmptySelf8(long refNdx);
  private native void Relink11(long refNdx
                              ,long parent);
}
