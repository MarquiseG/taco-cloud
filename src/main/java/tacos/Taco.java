/**
 * ***************************************************************************
 * <p>
 * $RCSfile: Taco.java,v $
 * <p>
 * <p>
 * <p>
 * ***************************************************************************
 * <p>
 * $Revision: 1.0 $
 * <p>
 * $Id: Taco.java,v 2019/05/27 4:14 PM mkaroune Exp $
 * <p>
 * ***************************************************************************
 * <p>
 * Copyright (c) 2019 Nokia . All Rights Reserved.
 * Please read the associated COPYRIGHTS file for more details.
 * <p>
 * ***************************************************************************
 */


package tacos;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Data
public class Taco
{
    @NotNull
    @Size(min = 5, message = "Name must be at least 5 characters long")
    private String name;
    @Size(min=1, message="You must choose at least 1 ingredient")
    private List<String> ingredients;
}
