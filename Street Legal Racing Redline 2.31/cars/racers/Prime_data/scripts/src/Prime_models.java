package java.game.cars;

import java.io.*;
import java.util.*;
import java.util.resource.*;
import java.game.parts.*;
import java.game.parts.bodypart.*;

public class Prime_models extends Chassis
{
	static int	MODEL_DLH_500	= 1;
	static int	MODEL_DLH_700	= 2;

	public Prime_models( int id )
	{
		super( id );
		carCategory = PACKAGE;

		make = MAKE_PRIME;
	}

	public void updatevariables()
	{
		super.updatevariables();
	}
}
