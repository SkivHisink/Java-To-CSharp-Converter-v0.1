using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueLookup : RescueHistoryObject
{


  protected RescueLookup(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueLookup(string newName,
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

  public string LookupName()
  {
    string myReturn = LookupName2(nativeNdx);
    return myReturn;
  }

  public void SetName(string newName)
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

  public bool IsNamed(string possibleName)
  {
    bool myReturn = IsNamed5(nativeNdx
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

  public int Count(bool throwIfTooBig) //thro RuntimeException
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

  public bool IsOfType(int thisType)
  {
    bool myReturn = IsOfType9(nativeNdx
                                   ,thisType);
    return myReturn;
  }

}

}