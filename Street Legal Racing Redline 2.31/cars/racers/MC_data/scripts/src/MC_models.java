package java.game.cars;

import java.util.*;
import java.util.resource.*;
import java.game.parts.bodypart.*;


public class MC_models extends Chassis
{
	static int	MODEL_GT	= 1;
	static int	MODEL_GTB	= 2;
	static int	MODEL_GTLE	= 3;

	public MC_models( int id )
	{
		super( id );
		carCategory = PACKAGE;

		make = MAKE_MC;
	}

	public void updatevariables()
	{
		super.updatevariables();
	}
}
