using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class cBagRescueHistoryObject : RjniBaseClass
{


  protected cBagRescueHistoryObject(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public cBagRescueHistoryObject()
  {
    nativeNdx = Create_cBagRescueHistoryObject0();
  }

  public void dispose()
  {
    Delete_cBagRescueHistoryObject(nativeNdx);
  }

  public void AddTo(RescueHistoryObject newObject)
  {
    AddTo2(nativeNdx
               ,(newObject == null) ? 0 : newObject.nativeNdx);
  }

  public bool RemoveFrom(RescueHistoryObject existingObject)
  {
    bool myReturn = RemoveFrom3(nativeNdx
                                     ,(existingObject == null) ? 0 : existingObject.nativeNdx);
    return myReturn;
  }

  public RescueHistoryObject NthObject(long ordinal)
  {
    long returnNdx = NthObject4(nativeNdx
                                ,ordinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueHistoryObject myReturn = new RescueHistoryObject(returnNdx);
      int isA = myReturn.IsA();
      switch(isA)
      {
      case RescueObject.R_RescueBlock:
        myReturn = new RescueBlock(returnNdx);
        break;
      case RescueObject.R_RescueBlockUnitSide:
        myReturn = new RescueBlockUnitSide(returnNdx);
        break;
      case RescueObject.R_RescueCoordinateSystem:
        myReturn = new RescueCoordinateSystem(returnNdx);
        break;
      case RescueObject.R_RescueDataContainer:
        myReturn = new RescueDataContainer(returnNdx);
        break;
      case RescueObject.R_RescueFaultIntersection:
        myReturn = new RescueFaultIntersection(returnNdx);
        break;
      case RescueObject.R_RescueGeobodyPart:
        myReturn = new RescueGeobodyPart(returnNdx);
        break;
      case RescueObject.R_RescueGeobodyVolume:
        myReturn = new RescueGeobodyVolume(returnNdx);
        break;
      case RescueObject.R_RescueGeometry:
        myReturn = new RescueGeometry(returnNdx);
        break;
      case RescueObject.R_RescueGrid:
        myReturn = new RescueGrid(returnNdx);
        break;
      case RescueObject.R_RescueHistory:
        myReturn = new RescueHistory(returnNdx);
        break;
      case RescueObject.R_RescueIJSurface:
        myReturn = new RescueIJSurface(returnNdx);
        break;
      case RescueObject.R_RescueLogicalOrder:
        myReturn = new RescueLogicalOrder(returnNdx);
        break;
      case RescueObject.R_RescueLogicalOrderEntry:
        myReturn = new RescueLogicalOrderEntry(returnNdx);
        break;
      case RescueObject.R_RescueLookup:
        myReturn = new RescueLookup(returnNdx);
        break;
      case RescueObject.R_RescueMacroVolume:
        myReturn = new RescueMacroVolume(returnNdx);
        break;
      case RescueObject.R_RescueModel:
        myReturn = new RescueModel(returnNdx);
        break;
      case RescueObject.R_RescueModelPropertyGroup:
        myReturn = new RescueModelPropertyGroup(returnNdx);
        break;
      case RescueObject.R_RescueProperty:
        myReturn = new RescueProperty(returnNdx);
        break;
      case RescueObject.R_RescuePropertyGroup:
        myReturn = new RescuePropertyGroup(returnNdx);
        break;
      case RescueObject.R_RescueTimeStepGroup:
        myReturn = new RescueTimeStepGroup(returnNdx);
        break;
      case RescueObject.R_RescueWellbore:
        myReturn = new RescueWellbore(returnNdx);
        break;
      case RescueObject.R_RescueWellboreProperty:
        myReturn = new RescueWellboreProperty(returnNdx);
        break;
      case RescueObject.R_RescueWireframe:
        myReturn = new RescueWireframe(returnNdx);
        break;
      case RescueObject.R_RescueWireframeOwner:
        myReturn = new RescueWireframeOwner(returnNdx);
        break;
      }
      return myReturn;
    }
  }

  public RescueHistoryObject NthObject(int ordinal)
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

  public int Count(bool throwIfTooBig) //thro Exception
  {
    return RescueContext.Return32For64(Count64(), throwIfTooBig);
  }

}

}