package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueReferenceSurface.java

    Rod Hanks   Sep  5 2005

******************************************************************/
public class RescueReferenceSurface extends RescueSurface
{


  protected RescueReferenceSurface(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  protected RescueReferenceSurface()
  {
  }

  public RescueReferenceSurface(RescueModel model,
                                int orientation,
                                float i_origin,
                                float i_step,
                                long i_lowbound,
                                long i_count,
                                float j_origin,
                                float j_step,
                                long j_lowbound,
                                long j_count,
                                float missingValue,
                                int typeIn)
  {
    nativeNdx = Create_RescueReferenceSurface0((model == null) ? 0 : model.nativeNdx,
                                               orientation,
                                               i_origin,
                                               i_step,
                                               i_lowbound,
                                               i_count,
                                               j_origin,
                                               j_step,
                                               j_lowbound,
                                               j_count,
                                               missingValue,
                                               typeIn);
  }

  public RescueReferenceSurface(RescueModel model,
                                int orientation,
                                float i_origin,
                                float i_step,
                                long i_lowbound,
                                long i_count,
                                float j_origin,
                                float j_step,
                                long j_lowbound,
                                long j_count,
                                float missingValue,
                                float[] values,
                                int typeIn)
  {
    nativeNdx = Create_RescueReferenceSurface1((model == null) ? 0 : model.nativeNdx,
                                               orientation,
                                               i_origin,
                                               i_step,
                                               i_lowbound,
                                               i_count,
                                               j_origin,
                                               j_step,
                                               j_lowbound,
                                               j_count,
                                               missingValue,
                                               values,
                                               typeIn);
  }

  public RescueReferenceSurface(RescueModel model,
                                int orientation,
                                long i_lowbound,
                                long i_count,
                                long j_lowbound,
                                long j_count,
                                float missingValue,
                                int typeIn)
  {
    nativeNdx = Create_RescueReferenceSurface2((model == null) ? 0 : model.nativeNdx,
                                               orientation,
                                               i_lowbound,
                                               i_count,
                                               j_lowbound,
                                               j_count,
                                               missingValue,
                                               typeIn);
  }

  public RescueReferenceSurface(RescueModel model,
                                int orientation,
                                float missingValue,
                                int typeIn)
  {
    nativeNdx = Create_RescueReferenceSurface3((model == null) ? 0 : model.nativeNdx,
                                               orientation,
                                               missingValue,
                                               typeIn);
  }

  public RescueReferenceSurface(RescueModel model,
                                int orientation,
                                long i_lowbound,
                                long i_count,
                                long j_lowbound,
                                long j_count,
                                float missingValue,
                                float[] tripletArray,
                                int typeIn)
  {
    nativeNdx = Create_RescueReferenceSurface4((model == null) ? 0 : model.nativeNdx,
                                               orientation,
                                               i_lowbound,
                                               i_count,
                                               j_lowbound,
                                               j_count,
                                               missingValue,
                                               tripletArray,
                                               typeIn);
  }

  public boolean IsOfType(int thisType)
  {
    boolean myReturn = IsOfType5(nativeNdx
                                   ,thisType);
    return myReturn;
  }

  private native long Create_RescueReferenceSurface0(long model,
                                                    int orientation,
                                                    float i_origin,
                                                    float i_step,
                                                    long i_lowbound,
                                                    long i_count,
                                                    float j_origin,
                                                    float j_step,
                                                    long j_lowbound,
                                                    long j_count,
                                                    float missingValue,
                                                    int typeIn);
  private native long Create_RescueReferenceSurface1(long model,
                                                    int orientation,
                                                    float i_origin,
                                                    float i_step,
                                                    long i_lowbound,
                                                    long i_count,
                                                    float j_origin,
                                                    float j_step,
                                                    long j_lowbound,
                                                    long j_count,
                                                    float missingValue,
                                                    float[] values,
                                                    int typeIn);
  private native long Create_RescueReferenceSurface2(long model,
                                                    int orientation,
                                                    long i_lowbound,
                                                    long i_count,
                                                    long j_lowbound,
                                                    long j_count,
                                                    float missingValue,
                                                    int typeIn);
  private native long Create_RescueReferenceSurface3(long model,
                                                    int orientation,
                                                    float missingValue,
                                                    int typeIn);
  private native long Create_RescueReferenceSurface4(long model,
                                                    int orientation,
                                                    long i_lowbound,
                                                    long i_count,
                                                    long j_lowbound,
                                                    long j_count,
                                                    float missingValue,
                                                    float[] tripletArray,
                                                    int typeIn);
  private native boolean IsOfType5(long refNdx
                                  ,int thisType);
}
