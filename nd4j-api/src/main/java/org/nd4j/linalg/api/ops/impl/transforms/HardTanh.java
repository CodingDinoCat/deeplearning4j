/*
 * Copyright 2015 Skymind,Inc.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package org.nd4j.linalg.api.ops.impl.transforms;

import org.apache.commons.math3.util.FastMath;
import org.nd4j.linalg.api.complex.IComplexNumber;
import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.api.ops.BaseTransformOp;
import org.nd4j.linalg.util.ComplexUtil;

/**
 * Hard tanh elementwise function
 * @author Adam Gibson
 */
public class HardTanh extends BaseTransformOp {

    public HardTanh(INDArray x, INDArray z) {
        super(x, z);
    }

    public HardTanh(INDArray x, INDArray z, int n) {
        super(x, z, n);
    }

    public HardTanh(INDArray x, INDArray y, INDArray z, int n) {
        super(x, y, z, n);
    }

    public HardTanh(INDArray x) {
        super(x);
    }

    @Override
    public String name() {
        return "hardtanh";
    }

    @Override
    public IComplexNumber op(IComplexNumber origin, double other, Object[] extraArgs) {
        return ComplexUtil.hardTanh(origin);
    }

    @Override
    public IComplexNumber op(IComplexNumber origin, float other, Object[] extraArgs) {
        return ComplexUtil.hardTanh(origin);
    }

    @Override
    public IComplexNumber op(IComplexNumber origin, IComplexNumber other, Object[] extraArgs) {
        return ComplexUtil.hardTanh(origin);
    }

    @Override
    public float op(float origin, float other, Object[] extraArgs) {
        return hardTanh(origin);
    }

    @Override
    public double op(double origin, double other, Object[] extraArgs) {
        return hardTanh(origin);
    }

    @Override
    public double op(double origin, Object[] extraArgs) {
        return hardTanh(origin);
    }

    @Override
    public float op(float origin, Object[] extraArgs) {
       return hardTanh(origin);
    }

    @Override
    public IComplexNumber op(IComplexNumber origin, Object[] extraArgs) {
        return ComplexUtil.hardTanh(origin);
    }

    private float hardTanh(float num) {
        return (float) hardTanh((double) num);
    }

    private double hardTanh(double num) {
        double tanh = FastMath.tanh(num);
        return tanh < -1.0 ? -1.0 : tanh > 1.0 ? 1.0 : tanh;
    }

}
