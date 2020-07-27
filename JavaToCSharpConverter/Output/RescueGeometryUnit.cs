using System;
using System.Collections.Generic;
using System.Text;

namespace RescueJ
{
    public class RescueGeometryUnit : RescueObject
    {


        protected RescueGeometryUnit(long ndxIn)
        {
            nativeNdx = ndxIn;
        }

        public RescueGeometryUnit(RescueGeometry parentGeometry,
                                  RescueUnit relatedUnit,
                                  int topLayerNdx,
                                  int bottomLayerNdx)
        {
            nativeNdx = Create_RescueGeometryUnit0((parentGeometry == null) ? 0 : parentGeometry.nativeNdx,
                                                   (relatedUnit == null) ? 0 : relatedUnit.nativeNdx,
                                                   topLayerNdx,
                                                   bottomLayerNdx);
        }

        public RescueUnit RelatedUnit()
        {
            long returnNdx = RelatedUnit1(nativeNdx);
            if (returnNdx == 0)
            {
                return null;
            }
            else
            {
                RescueUnit myReturn = new RescueUnit(returnNdx);
                return myReturn;
            }
        }

        public void SetRelatedUnit(RescueUnit unitIn)
        {
            SetRelatedUnit2(nativeNdx
                           , (unitIn == null) ? 0 : unitIn.nativeNdx);
        }

        public long TopLayerNdx64()
        {
            long myReturn = TopLayerNdx3(nativeNdx);
            return myReturn;
        }

        public int TopLayerNdx()
        {
            int myReturn = 0;
            try
            {
                myReturn = RescueContext.Return32For64(TopLayerNdx64(), false);
            }
            catch (Exception e)
            {
            }
            return myReturn;
        }

        public int TopLayerNdx(bool throwIfTooBig) //thro RuntimeException
        {
            return RescueContext.Return32For64(TopLayerNdx64(), throwIfTooBig);
        }

        public void SetTopLayerNdx(long ndxIn)
        {
            SetTopLayerNdx4(nativeNdx
                           , ndxIn);
        }

        public long BottomLayerNdx64()
        {
            long myReturn = BottomLayerNdx5(nativeNdx);
            return myReturn;
        }

        public int BottomLayerNdx()
        {
            int myReturn = 0;
            try
            {
                myReturn = RescueContext.Return32For64(BottomLayerNdx64(), false);
            }
            catch (Exception e)
            {
            }
            return myReturn;
        }

        public int BottomLayerNdx(bool throwIfTooBig) //thro RuntimeException
        {
            return RescueContext.Return32For64(BottomLayerNdx64(), throwIfTooBig);
        }

        public void SetBottomLayerNdx(long ndxIn)
        {
            SetBottomLayerNdx6(nativeNdx
                              , ndxIn);
        }

        public bool IsOfType(int thisType)
        {
            bool myReturn = IsOfType7(nativeNdx
                                           , thisType);
            return myReturn;
        }

    }

}