/*
 * Copyright (C) 2004-2016 Vote Rewarding System
 * 
 * This file is part of Vote Rewarding System.
 * 
 * Vote Rewarding System is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Vote Rewarding System is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.github.unafraid.votingreward.api.methods;

import org.json.JSONObject;

import com.github.unafraid.votingreward.api.VotingResponces;
import com.github.unafraid.votingreward.api.objects.ServerVotingResultData;

/**
 * @author UnAfraid
 */
public class GetServerData implements IVotingMethod<ServerVotingResultData>
{
	private static final String PATH = "getServerData";
	
	public GetServerData()
	{
	}
	
	@Override
	public String getPath()
	{
		return PATH;
	}
	
	@Override
	public ServerVotingResultData deserializeResponse(JSONObject answer)
	{
		return new ServerVotingResultData(answer.getJSONObject(VotingResponces.RESPONSE_FIELD_RESULT));
	}
	
	@Override
	public JSONObject toJson()
	{
		return new JSONObject();
	}
}
