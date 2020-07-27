package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueLookup.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueLookup extends RescueHistoryObject
{


  protected RescueLookup(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueLookup(java.lang.String newName,
                      long size,
                      RescueModel newParentModel)
  {
    nativeNdx = Create_RescueLookup0(newName,
                                     size,
                                     (newParentModel == null) ? 0 : newParentModel.nativeNdx);
  }

  public void dispose()
  {
    Delete_RescueLookup(nativeNdx);
  }

  public java.lang.String LookupName()
  {
    java.lang.String myReturn = LookupName2(nativeNdx);
    return myReturn;
  }

  public void SetName(java.lang.String newName)
  {
    SetName3(nativeNdx
            ,newName);
  }

  public RescueModel ParentModel()
  {
    long returnNdx = ParentModel4(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueModel myReturn = new RescueModel(returnNdx);
      return myReturn;
    }
  }

  public boolean IsNamed(java.lang.String possibleName)
  {
    boolean myReturn = IsNamed5(nativeNdx
                                  ,possibleName);
    return myReturn;
  }

  public long Count64()
  {
    long myReturn = Count6(nativeNdx);
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

  public RescueLookupItem NthItem(long zeroBasedIndex)
  {
    long returnNdx = NthItem7(nativeNdx
                              ,zeroBasedIndex);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueLookupItem myReturn = new RescueLookupItem(returnNdx);
      int isA = myReturn.IsA();
      switch(isA)
      {
      case RescueObject.R_RescueLookupString:
        myReturn = new RescueLookupString(returnNdx);
        break;
      case RescueObject.R_RescueLookupTable:
        myReturn = new RescueLookupTable(returnNdx);
        break;
      }
      return myReturn;
    }
  }

  public void SetNthItem(long zeroBasedIndex,
                         RescueLookupItem newItem)
  {
    SetNthItem8(nativeNdx
               ,zeroBasedIndex
               ,(newItem == null) ? 0 : newItem.nativeNdx);
  }

  public boolean IsOfType(int thisType)
  {
    boolean myReturn = IsOfType9(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  private native long Create_RescueLookup0(java.lang.String newName,
                                          long size,
                                          long newParentModel);
  private native void Delete_RescueLookup(long ndx);
  private native java.lang.String LookupName2(long refNdx);
  private native void SetName3(long refNdx
                              ,java.lang.String newName);
  private native long ParentModel4(long refNdx);
  private native boolean IsNamed5(long refNdx
                                 ,java.lang.String possibleName);
  private native long Count6(long refNdx);
  private native long NthItem7(long refNdx
                               ,long zeroBasedIndex);
  private native void SetNthItem8(long refNdx
                                 ,long zeroBasedIndex
                                 ,long newItem);
  private native boolean IsOfType9(long refNdx
                                  ,int thisType);
}
