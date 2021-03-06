package com.pwf.protohelper.models;

import com.pwf.core.EngineData;
import com.pwf.mvcme.Repository;

/**
 *
 * @author mfullen
 */
public interface EngineDataRepository extends Repository<EngineData>
{
    EngineData findBy(String url);
}
