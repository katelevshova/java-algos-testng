package com.hally.stats;

import java.util.List;

/**
 * Created by Kateryna Levshova
 * @date 17.09.2015
 */
public interface ISitesStats
{
	void reportPageAccess(String pageName);

	List<String> getTopAllPages();
}
