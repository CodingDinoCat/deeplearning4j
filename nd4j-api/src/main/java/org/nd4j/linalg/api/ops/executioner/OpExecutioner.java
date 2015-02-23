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

package org.nd4j.linalg.api.ops.executioner;

import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.api.ops.Accumulation;
import org.nd4j.linalg.api.ops.Op;
import org.nd4j.linalg.api.ops.TransformOp;

/**
 * An operation executioner handles storage specific details of
 * executing an operation
 *
 * @author Adam Gibson
 */
public interface OpExecutioner {

    /**
     * Execute the operation
     * @param op the operation to execute
     */
    Op exec(Op op);

    /**
     * Execute an op with extra arguments
     * @param op the operation to execute
     * @param extraArgs the extra arguments
     */
    Op exec(Op op, Object[] extraArgs);



    /**
     * Execute the operation
     * @param op the operation to execute
     */
    INDArray execAndReturn(TransformOp op);

    /**
     * Execute an op with extra arguments
     * @param op the operation to execute
     * @param extraArgs the extra arguments
     */
    INDArray execAndReturn(TransformOp op, Object[] extraArgs);

    /**
     * Execute and return the result from an accumulation
     * @param op the operation to execute
     * @param extraArgs the extra arguments to invoke with
     * @return the accumulated result
     */
    Accumulation execAndReturn(Accumulation op,Object[] extraArgs);


    /**
     * Execute and return the result from an accumulation
     * @param op the operation to execute
     * @return the accumulated result
     */
    Accumulation execAndReturn(Accumulation op);


}
