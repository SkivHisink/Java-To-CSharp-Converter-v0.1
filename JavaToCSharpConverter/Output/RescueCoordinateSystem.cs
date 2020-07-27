using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueCoordinateSystem : RescueHistoryObject
{

  public static final int LUF = 0;
  public static final int LUB = 1;
  public static final int LDF = 2;
  public static final int LDB = 3;
  public static final int RUF = 4;
  public static final int RUB = 5;
  public static final int RDF = 6;
  public static final int RDB = 7;

  protected RescueCoordinateSystem(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueCoordinateSystem(RescueContext context,
                                string name,
                                int displayOrientationIn,
                                RescueVertex vertexIn,
                                string Xproperty,
                                string Xuom,
                                string Yproperty,
                                string Yuom,
                                string Zproperty,
                                string Zuom,
                                int insysIn,
                                int inzoneIn,
                                int inUnitIn,
                                int insphIn,
                                double semiMajorAxisIn,
                                double eccentricityIn,
                                double standardLatIn,
                                double secondLatIn,
                                double centralLongIn,
                                double latOriginIn,
                                double FALSEEastingIn,
                                double FALSENorthingIn)
  {
    nativeNdx = Create_RescueCoordinateSystem0((context == null) ? 0 : context.nativeNdx,
                                               name,
                                               displayOrientationIn,
                                               (vertexIn == null) ? 0 : vertexIn.nativeNdx,
                                               Xproperty,
                                               Xuom,
                                               Yproperty,
                                               Yuom,
                                               Zproperty,
                                               Zuom,
                                               insysIn,
                                               inzoneIn,
                                               inUnitIn,
                                               insphIn,
                                               semiMajorAxisIn,
                                               eccentricityIn,
                                               standardLatIn,
                                               secondLatIn,
                                               centralLongIn,
                                               latOriginIn,
                                               FALSEEastingIn,
                                               FALSENorthingIn);
  }

  public int PublicEPSG()
  {
    int myReturn = PublicEPSG1(nativeNdx);
	return myReturn;
  }

  public void SetPublicEPSG(int epsgIn)
  {
    SetPublicEPSG2(nativeNdx, epsgIn);
  }

  public int Dimensions()
  {
    int myReturn = Dimensions1(nativeNdx);
    return myReturn;
  }

  public RescueCoordinateSystemAxis Axis(int zeroBasedOrdinal)
  {
    long returnNdx = Axis2(nativeNdx
                           ,zeroBasedOrdinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueCoordinateSystemAxis myReturn = new RescueCoordinateSystemAxis(returnNdx);
      return myReturn;
    }
  }

  public RescueCoordinateSystemAxis AxisIdentifiedBy(long identifier)
  {
    long returnNdx = AxisIdentifiedBy3(nativeNdx
                                       ,identifier);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueCoordinateSystemAxis myReturn = new RescueCoordinateSystemAxis(returnNdx);
      return myReturn;
    }
  }

  public RescueVertex Vertex()
  {
    long returnNdx = Vertex4(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueVertex myReturn = new RescueVertex(returnNdx);
      return myReturn;
    }
  }

  public void SetVertex(RescueVertex newVertex)
  {
    SetVertex5(nativeNdx
              ,(newVertex == null) ? 0 : newVertex.nativeNdx);
  }

  public string Name()
  {
    string myReturn = Name6(nativeNdx);
    return myReturn;
  }

  public int OrientationIs()
  {
    int myReturn = OrientationIs7(nativeNdx);
    return myReturn;
  }

  public int InSys()
  {
    int myReturn = InSys8(nativeNdx);
    return myReturn;
  }

  public int InZone()
  {
    int myReturn = InZone9(nativeNdx);
    return myReturn;
  }

  public int InUnit()
  {
    int myReturn = InUnit10(nativeNdx);
    return myReturn;
  }

  public int InSpheroid()
  {
    int myReturn = InSpheroid11(nativeNdx);
    return myReturn;
  }

  public double SemiMajorAxis()
  {
    double myReturn = SemiMajorAxis12(nativeNdx);
    return myReturn;
  }

  public double EccentricityOrSemiMinorAxis()
  {
    double myReturn = EccentricityOrSemiMinorAxis13(nativeNdx);
    return myReturn;
  }

  public double StandardLat()
  {
    double myReturn = StandardLat14(nativeNdx);
    return myReturn;
  }

  public double SecondLat()
  {
    double myReturn = SecondLat15(nativeNdx);
    return myReturn;
  }

  public double CentralLong()
  {
    double myReturn = CentralLong16(nativeNdx);
    return myReturn;
  }

  public double LatOrigin()
  {
    double myReturn = LatOrigin17(nativeNdx);
    return myReturn;
  }

  public double FalseEasting()
  {
    double myReturn = FalseEasting18(nativeNdx);
    return myReturn;
  }

  public double FalseNorthing()
  {
    double myReturn = FalseNorthing19(nativeNdx);
    return myReturn;
  }

  public int NdxOf(RescueCoordinateSystemAxis axisIn)
  {
    int myReturn = NdxOf20(nativeNdx
                         ,(axisIn == null) ? 0 : axisIn.nativeNdx);
    return myReturn;
  }

  public RescueContext Context()
  {
    long returnNdx = Context21(nativeNdx);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueContext myReturn = new RescueContext(returnNdx);
      return myReturn;
    }
  }

  public bool IsOfType(int thisType)
  {
    bool myReturn = IsOfType22(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  public void dispose()
  {
    Delete_RescueCoordinateSystem(nativeNdx);
  }

}

}