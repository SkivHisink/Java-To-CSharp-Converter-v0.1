package org.Rescue.rjni;
import java.lang.*;
/*****************************************************************

    RescueGeometryLGRList.java

  Returns a table-and-column style listing of LGR's in a
  RescueGeometry tree that places LGR's within context of groupings 
  and times.

  This class is ephemeral.  It is accurate at the moment it is 
  created but any editing events after that point are not reflected
  in it's values.  It is not persistent.

  The order is either : by group, by time step, by geometry
               or     : by time step, by group, by geometry

  LGRs that are in more than one group and/or timestep may appear
  more than once.

  LGRs that are not in a timestep will not appear.

  The geometry that you pass must be a root geometry, not an LGR.

    Rod Hanks   October 2006

******************************************************************/
public class RescueGeometryLGRList extends RjniBaseClass
{
	protected RescueGeometryLGRList(long ndxIn)
  {
    nativeNdx = ndxIn;
  }

  public RescueGeometryLGRList(RescueGeometry geometry, 
																		boolean byTimeStep,               // TRUE if order of rows is by time step, by group, by geometry.
                                                                      // FALSE for by group, by time step by geometry.  Of course,
                                                                      // if you limit to a single group or time step this
                                                                      // is immaterial.
																	  RescuePropertyGroup nullOrGroup,  // Non-null, limit to particular RescuePropertyGroup.
																	  java.lang.String nullOrTimeStepName)
  {
    nativeNdx = Create_RescueGeometryLGRList0((geometry == null) ? 0 : geometry.nativeNdx,
                                                   byTimeStep, 
																									 (nullOrGroup == null) ? 0 : nullOrGroup.nativeNdx,
                                                    nullOrTimeStepName);
  }

	
  public void dispose()
  {
    Delete_RescueGeometryLGRList(nativeNdx);
  }


  public int Count()
  {
    int myReturn = Count1(nativeNdx);
    return myReturn;
  }

  public RescueGeometry NthRowGeometry(long zeroBasedOrdinal)
  {
    long returnNdx = NthRowGeometry3(nativeNdx
                             ,zeroBasedOrdinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueGeometry myReturn = new RescueGeometry(returnNdx);
      return myReturn;
    }
  }

  public RescueTimeStepGroup NthRowTimeStepGroup(long zeroBasedOrdinal)
  {
    long returnNdx = NthRowTimeStepGroup4(nativeNdx
                             ,zeroBasedOrdinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescueTimeStepGroup myReturn = new RescueTimeStepGroup(returnNdx);
      return myReturn;
    }
  }

  public RescuePropertyGroup NthRowPropertyGroup(long zeroBasedOrdinal)
  {
    long returnNdx = NthRowPropertyGroup5(nativeNdx
                             ,zeroBasedOrdinal);
    if (returnNdx == 0)
    {
      return null;
    }
    else
    {
      RescuePropertyGroup myReturn = new RescuePropertyGroup(returnNdx);
      return myReturn;
    }
  }

  private native long Create_RescueGeometryLGRList0(long geometryNdx,
																												 boolean byTimeStep,
																												 long groupNdx,
																												 java.lang.String nullOrTimeStepName);
  private native void Delete_RescueGeometryLGRList(long ndx);
  private native int Count1(long refNdx);
  private native long NthRowGeometry3(long refNdx
                               ,long zeroBasedOrdinal);
  private native long NthRowTimeStepGroup4(long refNdx
                               ,long zeroBasedOrdinal);
  private native long NthRowPropertyGroup5(long refNdx
                               ,long zeroBasedOrdinal);
}