using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueHistory : RescueHistoryObject
{


  protected RescueHistory(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueHistory(RescueModel parentModelIn,
                       string changeDescription,
                       string parsableDescription)
  {
    nativeNdx = Create_RescueHistory0((parentModelIn == null) ? 0 : parentModelIn.nativeNdx,
                                      changeDescription,
                                      parsableDescription);
  }

  public void AddObjectChanged(RescueHistoryObject newObjectChanged)
  {
    AddObjectChanged1(nativeNdx
                     ,(newObjectChanged == null) ? 0 : newObjectChanged.nativeNdx);
  }

  public void AddRelatedObject(RescueHistoryObject newRelatedObject)
  {
    AddRelatedObject2(nativeNdx
                     ,(newRelatedObject == null) ? 0 : newRelatedObject.nativeNdx);
  }

  public void AddRelatedHistory(RescueHistory newRelatedHistory)
  {
    AddRelatedHistory3(nativeNdx
                      ,(newRelatedHistory == null) ? 0 : newRelatedHistory.nativeNdx);
  }

  public void RemoveObjectChanged(RescueHistoryObject newObjectChanged)
  {
    RemoveObjectChanged4(nativeNdx
                        ,(newObjectChanged == null) ? 0 : newObjectChanged.nativeNdx);
  }

  public void RemoveRelatedObject(RescueHistoryObject newRelatedObject)
  {
    RemoveRelatedObject5(nativeNdx
                        ,(newRelatedObject == null) ? 0 : newRelatedObject.nativeNdx);
  }

  public void RemoveRelatedHistory(RescueHistory newRelatedHistory)
  {
    RemoveRelatedHistory6(nativeNdx
                         ,(newRelatedHistory == null) ? 0 : newRelatedHistory.nativeNdx);
  }

  public RescueModel ParentModel()
  {
    long returnNdx = ParentModel7(nativeNdx);
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

  public string ChangeDescription()
  {
    string myReturn = ChangeDescription8(nativeNdx);
    return myReturn;
  }

  public string ParsableDescription()
  {
    string myReturn = ParsableDescription9(nativeNdx);
    return myReturn;
  }

  public string TimeStamp()
  {
    string myReturn = TimeStamp10(nativeNdx);
    return myReturn;
  }

  public RescueHistory NthForwardRelatedHistory(long zeroBasedOrdinal)
  {
    long returnNdx = NthForwardRelatedHistory11(nativeNdx
                                               ,zeroBasedOrdinal);
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

  public RescueHistory NthBackwardRelatedHistory(long zeroBasedOrdinal)
  {
    long returnNdx = NthBackwardRelatedHistory12(nativeNdx
                                                ,zeroBasedOrdinal);
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

  public RescueHistoryObject NthChangedObject(long zeroBasedOrdinal)
  {
    long returnNdx = NthChangedObject13(nativeNdx
                                       ,zeroBasedOrdinal);
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

  public RescueHistoryObject NthRelatedObject(long zeroBasedOrdinal)
  {
    long returnNdx = NthRelatedObject14(nativeNdx
                                       ,zeroBasedOrdinal);
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

  public void dispose()
  {
    Delete_RescueHistory(nativeNdx);
  }

  public bool IsOfType(int thisType)
  {
    bool myReturn = IsOfType16(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  public void SetChangeDescription(string changeDescriptionIn)
  {
    SetChangeDescription17(nativeNdx, changeDescriptionIn);
  }

  public void SetParsableDescription(string parsableDescriptionIn)
  {
    SetParsableDescription18(nativeNdx, parsableDescriptionIn);
  }

}

}