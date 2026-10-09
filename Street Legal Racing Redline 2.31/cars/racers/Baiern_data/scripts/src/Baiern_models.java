package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class Baiern_models extends Chassis
{
	static int	MODEL_COUPESPORT			= 1;
	static int	MODEL_COUPESPORT_TURBO		= 2;
	static int	MODEL_COUPESPORT_GT_III		= 3;
	static int	MODEL_COUPESPORT_DTM		= 4;
	static int	MODEL_DEVILSPORT			= 5;
	static int	MODEL_DEVILSPORT_TURBO		= 6;
	static int	MODEL_DEVILSPORT_BITURBO	= 7;

	public Baiern_models( int id )
	{
		super( id );
		carCategory = PACKAGE;

		make = MAKE_BAIERN;
	}

	public void updatevariables()
	{
		super.updatevariables();
	}
}
