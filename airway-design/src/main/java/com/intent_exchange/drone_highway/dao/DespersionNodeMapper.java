/*
 * Copyright 2025 Intent Exchange, Inc.
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT
 * NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.intent_exchange.drone_highway.dao;

import com.intent_exchange.drone_highway.model.DespersionNode;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface DespersionNodeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table despersion_node
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer despersionNodeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table despersion_node
     *
     * @mbg.generated
     */
    int insert(DespersionNode row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table despersion_node
     *
     * @mbg.generated
     */
    int insertSelective(DespersionNode row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table despersion_node
     *
     * @mbg.generated
     */
    DespersionNode selectByPrimaryKey(Integer despersionNodeId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table despersion_node
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(DespersionNode row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table despersion_node
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(DespersionNode row);
}
