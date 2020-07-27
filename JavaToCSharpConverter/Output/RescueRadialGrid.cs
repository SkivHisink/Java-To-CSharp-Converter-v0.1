using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
public class RescueRadialGrid : RjniBaseClass
{


  protected RescueRadialGrid(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public void dispose()
  {
    Delete_RescueRadialGrid(nativeNdx);
  }

  public long MaxI64()
  {
    long myReturn = MaxI1(nativeNdx);
    return myReturn;
  }

  public int MaxI()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(MaxI64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int MaxI(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(MaxI64(), throwIfTooBig);
  }

  public long MaxJ64()
  {
    long myReturn = MaxJ2(nativeNdx);
    return myReturn;
  }

  public int MaxJ()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(MaxJ64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int MaxJ(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(MaxJ64(), throwIfTooBig);
  }

  public long MaxK64()
  {
    long myReturn = MaxK3(nativeNdx);
    return myReturn;
  }

  public int MaxK()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(MaxK64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int MaxK(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(MaxK64(), throwIfTooBig);
  }

  public long Nodes64()
  {
    long myReturn = Nodes4(nativeNdx);
    return myReturn;
  }

  public int Nodes()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(Nodes64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int Nodes(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(Nodes64(), throwIfTooBig);
  }

  public long VertexXLength64()
  {
    long myReturn = VertexXLength5(nativeNdx);
    return myReturn;
  }

  public int VertexXLength()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(VertexXLength64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int VertexXLength(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(VertexXLength64(), throwIfTooBig);
  }

  public long VertexYLength64()
  {
    long myReturn = VertexYLength6(nativeNdx);
    return myReturn;
  }

  public int VertexYLength()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(VertexYLength64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int VertexYLength(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(VertexYLength64(), throwIfTooBig);
  }

  public long VertexZLength64()
  {
    long myReturn = VertexZLength7(nativeNdx);
    return myReturn;
  }

  public int VertexZLength()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(VertexZLength64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int VertexZLength(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(VertexZLength64(), throwIfTooBig);
  }

  public float[] VertexX()
  {
    float[] myReturn = VertexX8(nativeNdx);
    return myReturn;
  }

  public float[] VertexY()
  {
    float[] myReturn = VertexY9(nativeNdx);
    return myReturn;
  }

  public float[] VertexZ()
  {
    float[] myReturn = VertexZ10(nativeNdx);
    return myReturn;
  }

  public long CopyArrays(long lowSrc,
                        long count,
                        float[] xs,
                        float[] ys,
                        float[] zs,
                        long offset)
  {
    long myReturn = CopyArrays11(nativeNdx
                              ,lowSrc
                              ,count
                              ,xs
                              ,ys
                              ,zs
                              ,offset);
    return myReturn;
  }

  public int CopyArrays(int lowSrc,
                        int count,
                        float[] xs,
                        float[] ys,
                        float[] zs,
                        int offset,
						bool throwIfTooBig) //thro RuntimeException
  {
    long myReturn = CopyArrays11(nativeNdx
                              ,lowSrc
                              ,count
                              ,xs
                              ,ys
                              ,zs
                              ,offset);
    return RescueContext.Return32For64(myReturn, throwIfTooBig);
  }

  public float[] CenterX()
  {
    float[] myReturn = CenterX12(nativeNdx);
    return myReturn;
  }

  public float[] CenterY()
  {
    float[] myReturn = CenterY13(nativeNdx);
    return myReturn;
  }

  public float[] CenterZ()
  {
    float[] myReturn = CenterZ14(nativeNdx);
    return myReturn;
  }

  public float[] CenterMD()
  {
    float[] myReturn = CenterMD15(nativeNdx);
    return myReturn;
  }

  public long CenterXLength64()
  {
    long myReturn = CenterXLength16(nativeNdx);
    return myReturn;
  }

  public int CenterXLength()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(CenterXLength64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int CenterXLength(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(CenterXLength64(), throwIfTooBig);
  }

  public long CenterYLength64()
  {
    long myReturn = CenterYLength17(nativeNdx);
    return myReturn;
  }

  public int CenterYLength()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(CenterYLength64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int CenterYLength(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(CenterYLength64(), throwIfTooBig);
  }

  public long CenterZLength64()
  {
    long myReturn = CenterZLength18(nativeNdx);
    return myReturn;
  }

  public int CenterZLength()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(CenterZLength64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int CenterZLength(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(CenterZLength64(), throwIfTooBig);
  }

  public long CenterMDLength64()
  {
    long myReturn = CenterMDLength19(nativeNdx);
    return myReturn;
  }

  public int CenterMDLength()
  {
    int myReturn = 0;
    try
    {
      myReturn = RescueContext.Return32For64(CenterMDLength64(), false);
    }
    catch (Exception e)
    {
    }
    return myReturn;
  }

  public int CenterMDLength(bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(CenterMDLength64(), throwIfTooBig);
  }

  public long CopyCenter(long lowSrc,
                        long count,
                        float[] xs,
                        float[] ys,
                        float[] zs,
                        float[] md,
                        long offset)
  {
    long myReturn = CopyCenter20(nativeNdx
                              ,lowSrc
                              ,count
                              ,xs
                              ,ys
                              ,zs
                              ,md
                              ,offset);
    return myReturn;
  }

  public int CopyCenter(int lowSrc,
                        int count,
                        float[] xs,
                        float[] ys,
                        float[] zs,
                        float[] md,
                        int offset,
						bool throwIfTooBig) //thro RuntimeException
  {
    long myReturn = CopyCenter20(nativeNdx
                              ,lowSrc
                              ,count
                              ,xs
                              ,ys
                              ,zs
                              ,md
                              ,offset);
    return RescueContext.Return32For64(myReturn, throwIfTooBig);
  }

  public static long MaxI(long radialCells)
  {
    long myReturn = MaxI21(
                         radialCells);
    return myReturn;
  }

  public static int MaxI(long radialCells, bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(MaxI(radialCells), throwIfTooBig);
  }

  public static long MaxJ(long angularCells,
                  bool closed)
  {
    long myReturn = MaxJ22(
                         angularCells
                        ,closed);
    return myReturn;
  }

  public static int MaxJ(long angularCells, bool closed, bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(MaxJ(angularCells, closed), throwIfTooBig);
  }

  public static long MaxK(long kLayers)
  {
    long myReturn = MaxK23(
                         kLayers);
    return myReturn;
  }

  public static int MaxK(long kLayers, bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(MaxK(kLayers), throwIfTooBig);
  }

  public static long Nodes(long radialCells,
                   long angularCells,
                   bool closed,
                   long kLayers)
  {
    long myReturn = Nodes24(
                          radialCells
                         ,angularCells
                         ,closed
                         ,kLayers);
    return myReturn;
  }

  public static int Nodes(int radialCells,
                   int angularCells,
                   bool closed,
                   int kLayers,
				   bool throwIfTooBig) //thro RuntimeException
  {
    return RescueContext.Return32For64(Nodes(radialCells, angularCells, closed, kLayers), throwIfTooBig);
  }

  public void Set(long radialCellsIn,
                  long angularCellsIn,
                  long kLayersIn,
                  bool closedIn,
                  float[] vertexXin,
                  float[] vertexYin,
                  float[] vertexZin,
                  float[] centerXin,
                  float[] centerYin,
                  float[] centerZin,
                  float[] centerMDin)
  {
    Set26(nativeNdx
        ,radialCellsIn
        ,angularCellsIn
        ,kLayersIn
        ,closedIn
        ,vertexXin
        ,vertexYin
        ,vertexZin
        ,centerXin
        ,centerYin
        ,centerZin
        ,centerMDin);
  }

}

}