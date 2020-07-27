using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueObject : RjniBaseClass
{

  public static final int R_TOMBSTONE = 0;
  public static final int R_RescueObject = 1;
  public static final int R_RescueModel = 2;
  public static final int R_RescueBlock = 3;
  public static final int R_RescueUnit = 4;
  public static final int R_RescueHorizon = 5;
  public static final int R_RescueSection = 6;
  public static final int R_RescueBlockUnit = 7;
  public static final int R_RescueBlockUnitSide = 8;
  public static final int R_RescueProperty = 9;
  public static final int R_RescuePropertyGroup = 10;
  public static final int R_RescueBlockUnitHorizonSurface = 11;
  public static final int R_RescueWellbore = 12;
  public static final int R_RescueWellboreProperty = 13;
  public static final int R_RescueGrid = 14;
  public static final int R_RescueGridAxis = 15;
  public static final int R_RescueArray = 16;
  public static final int R_RescueTripletArray = 17;
  public static final int R_RescueCoordinateSystemAxis = 18;
  public static final int R_RescueVertex = 19;
  public static final int R_RescueCoordinateSystem = 20;
  public static final int R_RescueSurface = 21;
  public static final int R_RescueDoubletArray = 22;
  public static final int R_RescueTrimVertex = 23;
  public static final int R_RescueEdgeSet = 24;
  public static final int R_RescueTrimEdge = 25;
  public static final int R_RescuePolyLine = 26;
  public static final int R_RescuePolyLineNode = 27;
  public static final int R_RescuePolyLineNodeUV = 28;
  public static final int R_RescueGeometry = 29;
  public static final int R_RescueSurfaceCell = 30;
  public static final int R_RescueWellboreSampling = 31;
  public static final int R_RescueWellboreSurface = 32;
  public static final int R_RescueWellboreCell = 33;
  public static final int R_RescueReferenceSurface = 34;
  public static final int R_RescueLookup = 35;
  public static final int R_RescueLookupItem = 36;
  public static final int R_RescueLookupString = 37;
  public static final int R_RescueLookupTable = 38;
  public static final int R_RescueArrayDouble = 39;
  public static final int R_RescueArrayByte = 40;
  public static final int R_RescueArrayShort = 41;
  public static final int R_RescueTrimLoop = 42;
  public static final int R_RescueArrayFloat = 43;
  public static final int R_RescueMacroVolume = 44;
  public static final int R_RescueModelPropertyGroup = 45;
  public static final int R_RescueTimeStepGroup = 46;
  public static final int R_RescueBitArray = 47;
  public static final int R_RescueColor = 48;
  public static final int R_RescueHistory = 49;
  public static final int R_RescueHistoryObject = 50;
  public static final int R_RescueArray2dVector = 51;
  public static final int R_RescueArray3dVector = 52;
  public static final int R_RescueColorTable = 53;
  public static final int R_RescueColorTableList = 54;
  public static final int R_RescueGeobody = 55;
  public static final int R_RescueGeobodyPart = 56;
  public static final int R_RescueGeobodySurface = 57;
  public static final int R_RescueGeobodyVolume = 58;
  public static final int R_RescueSurfaceToGrid = 59;
  public static final int R_RescuePolyLineNodeBUG = 60;
  public static final int R_RescueIJSurface = 61;
  public static final int R_RescueCellShape = 62;
  public static final int R_RescueEventDescr = 63;
  public static final int R_RescueLogicalOrder = 64;
  public static final int R_RescueFaultIntersection = 65;
  public static final int R_RescuePolyLineNodeAvatar = 66;
  public static final int R_RescueWireframeStub = 67;
  public static final int R_RescuePolyLineStub = 68;
  public static final int R_RescuePolyLineNodeAvatarStub = 69;
  public static final int R_RescueTrimVertexStub = 70;
  public static final int R_RescueEdgeSetStub = 71;
  public static final int R_RescueTrimLoopStub = 72;
  public static final int R_RescueWireframe = 73;
  public static final int R_RescueWireframeOwner = 74;
  public static final int R_RescueArrayInt = 75;
  public static final int R_RescueGeometryUnit = 76;
  public static final int R_RescueReservoir = 77;
  public static final int R_RescueQuadrupletArray = 78;
  public static final int R_RescuePolyLineNodeUVT = 79;
  public static final int R_RescueStairSteppedFault = 80;
  public static final int R_RescueLogicalOrderEntry = 81;
  public static final int R_RescueDataContainer = 82;

  protected RescueObject(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  protected RescueObject()
  {
  }

  public bool IsIdentifiedBy(long possibleID)
  {
    bool myReturn = IsIdentifiedBy0(nativeNdx
                                         ,possibleID);
    return myReturn;
  }

  public long Identifier64()
  {
    long myReturn = Identifier1(nativeNdx);
    return myReturn;
  }

  public int Identifier()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(Identifier64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public bool IsNamed(string mayBeName)
  {
    bool myReturn = IsNamed2(nativeNdx
                                  ,mayBeName);
    return myReturn;
  }

  public int IsA()
  {
    int myReturn = IsA3(nativeNdx);
    return myReturn;
  }

  public bool IsOfType(int thisType)
  {
    bool myReturn = IsOfType4(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  public void dispose()
  {
    Delete_RescueObject(nativeNdx);
  }

  public RescueObject(RescueContext context)
  {
    nativeNdx = Create_RescueObject6((context == null) ? 0 : context.nativeNdx);
  }

}

}