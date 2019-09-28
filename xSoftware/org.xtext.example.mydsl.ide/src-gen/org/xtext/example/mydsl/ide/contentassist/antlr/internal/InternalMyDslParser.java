package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_EQUAL", "RULE_SEMICOLON", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'string'", "'int'", "'boolean'", "'=='", "'>'", "'<'", "'>='", "'<='", "'FirstNameType'", "'LastNameType'", "'FamilyNameType'", "'FullNameType'", "'GenderType'", "'EmailAddressType'", "'PhoneType'", "'CountryType'", "'CityType'", "'CountryCodeType'", "'LatitudeType'", "'LongitudeType'", "'RowNumberType'", "'BooleanType'", "'GET'", "'POST'", "'PUT'", "'DELETE'", "'apiURL'", "'SimpleEntity'", "'{'", "'}'", "'('", "')'", "'mockType'", "'['", "']'", "'Entity'", "'URL'", "'/'", "'?'", "'${'", "'/:{'", "'Response'", "'Type'", "'Request'", "'Test'", "'service'", "'description'", "'Assertions'", "'Mapping'", "'{parameter'", "','", "'value'", "'request->'", "'response->'", "'parameter.'", "'.'", "'PK,mockType'", "'response.status'", "'response'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=6;
    public static final int RULE_EQUAL=7;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=4;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
    public static final int RULE_SEMICOLON=8;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleApi"
    // InternalMyDsl.g:53:1: entryRuleApi : ruleApi EOF ;
    public final void entryRuleApi() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleApi EOF )
            // InternalMyDsl.g:55:1: ruleApi EOF
            {
             before(grammarAccess.getApiRule()); 
            pushFollow(FOLLOW_1);
            ruleApi();

            state._fsp--;

             after(grammarAccess.getApiRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleApi"


    // $ANTLR start "ruleApi"
    // InternalMyDsl.g:62:1: ruleApi : ( ( rule__Api__Group__0 ) ) ;
    public final void ruleApi() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Api__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Api__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Api__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__Api__Group__0 )
            {
             before(grammarAccess.getApiAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__Api__Group__0 )
            // InternalMyDsl.g:69:4: rule__Api__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Api__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getApiAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleApi"


    // $ANTLR start "entryRuleEntidad"
    // InternalMyDsl.g:78:1: entryRuleEntidad : ruleEntidad EOF ;
    public final void entryRuleEntidad() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleEntidad EOF )
            // InternalMyDsl.g:80:1: ruleEntidad EOF
            {
             before(grammarAccess.getEntidadRule()); 
            pushFollow(FOLLOW_1);
            ruleEntidad();

            state._fsp--;

             after(grammarAccess.getEntidadRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEntidad"


    // $ANTLR start "ruleEntidad"
    // InternalMyDsl.g:87:1: ruleEntidad : ( ( rule__Entidad__Alternatives ) ) ;
    public final void ruleEntidad() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Entidad__Alternatives ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Entidad__Alternatives ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Entidad__Alternatives ) )
            // InternalMyDsl.g:93:3: ( rule__Entidad__Alternatives )
            {
             before(grammarAccess.getEntidadAccess().getAlternatives()); 
            // InternalMyDsl.g:94:3: ( rule__Entidad__Alternatives )
            // InternalMyDsl.g:94:4: rule__Entidad__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Entidad__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEntidadAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEntidad"


    // $ANTLR start "entryRuleSimpleEntity"
    // InternalMyDsl.g:103:1: entryRuleSimpleEntity : ruleSimpleEntity EOF ;
    public final void entryRuleSimpleEntity() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleSimpleEntity EOF )
            // InternalMyDsl.g:105:1: ruleSimpleEntity EOF
            {
             before(grammarAccess.getSimpleEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleSimpleEntity();

            state._fsp--;

             after(grammarAccess.getSimpleEntityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSimpleEntity"


    // $ANTLR start "ruleSimpleEntity"
    // InternalMyDsl.g:112:1: ruleSimpleEntity : ( ( rule__SimpleEntity__Group__0 ) ) ;
    public final void ruleSimpleEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__SimpleEntity__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__SimpleEntity__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__SimpleEntity__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__SimpleEntity__Group__0 )
            {
             before(grammarAccess.getSimpleEntityAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__SimpleEntity__Group__0 )
            // InternalMyDsl.g:119:4: rule__SimpleEntity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SimpleEntity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSimpleEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSimpleEntity"


    // $ANTLR start "entryRuleAtributo"
    // InternalMyDsl.g:128:1: entryRuleAtributo : ruleAtributo EOF ;
    public final void entryRuleAtributo() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleAtributo EOF )
            // InternalMyDsl.g:130:1: ruleAtributo EOF
            {
             before(grammarAccess.getAtributoRule()); 
            pushFollow(FOLLOW_1);
            ruleAtributo();

            state._fsp--;

             after(grammarAccess.getAtributoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtributo"


    // $ANTLR start "ruleAtributo"
    // InternalMyDsl.g:137:1: ruleAtributo : ( ( rule__Atributo__Alternatives ) ) ;
    public final void ruleAtributo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Atributo__Alternatives ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Atributo__Alternatives ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Atributo__Alternatives ) )
            // InternalMyDsl.g:143:3: ( rule__Atributo__Alternatives )
            {
             before(grammarAccess.getAtributoAccess().getAlternatives()); 
            // InternalMyDsl.g:144:3: ( rule__Atributo__Alternatives )
            // InternalMyDsl.g:144:4: rule__Atributo__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Atributo__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAtributoAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtributo"


    // $ANTLR start "entryRuleAtributoMocka"
    // InternalMyDsl.g:153:1: entryRuleAtributoMocka : ruleAtributoMocka EOF ;
    public final void entryRuleAtributoMocka() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleAtributoMocka EOF )
            // InternalMyDsl.g:155:1: ruleAtributoMocka EOF
            {
             before(grammarAccess.getAtributoMockaRule()); 
            pushFollow(FOLLOW_1);
            ruleAtributoMocka();

            state._fsp--;

             after(grammarAccess.getAtributoMockaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtributoMocka"


    // $ANTLR start "ruleAtributoMocka"
    // InternalMyDsl.g:162:1: ruleAtributoMocka : ( ( rule__AtributoMocka__Group__0 ) ) ;
    public final void ruleAtributoMocka() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__AtributoMocka__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__AtributoMocka__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__AtributoMocka__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__AtributoMocka__Group__0 )
            {
             before(grammarAccess.getAtributoMockaAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__AtributoMocka__Group__0 )
            // InternalMyDsl.g:169:4: rule__AtributoMocka__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AtributoMocka__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAtributoMockaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtributoMocka"


    // $ANTLR start "entryRuleAtributoArreglo"
    // InternalMyDsl.g:178:1: entryRuleAtributoArreglo : ruleAtributoArreglo EOF ;
    public final void entryRuleAtributoArreglo() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleAtributoArreglo EOF )
            // InternalMyDsl.g:180:1: ruleAtributoArreglo EOF
            {
             before(grammarAccess.getAtributoArregloRule()); 
            pushFollow(FOLLOW_1);
            ruleAtributoArreglo();

            state._fsp--;

             after(grammarAccess.getAtributoArregloRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtributoArreglo"


    // $ANTLR start "ruleAtributoArreglo"
    // InternalMyDsl.g:187:1: ruleAtributoArreglo : ( ( rule__AtributoArreglo__Group__0 ) ) ;
    public final void ruleAtributoArreglo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__AtributoArreglo__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__AtributoArreglo__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__AtributoArreglo__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__AtributoArreglo__Group__0 )
            {
             before(grammarAccess.getAtributoArregloAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__AtributoArreglo__Group__0 )
            // InternalMyDsl.g:194:4: rule__AtributoArreglo__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AtributoArreglo__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAtributoArregloAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtributoArreglo"


    // $ANTLR start "entryRuleAtributoSimple"
    // InternalMyDsl.g:203:1: entryRuleAtributoSimple : ruleAtributoSimple EOF ;
    public final void entryRuleAtributoSimple() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( ruleAtributoSimple EOF )
            // InternalMyDsl.g:205:1: ruleAtributoSimple EOF
            {
             before(grammarAccess.getAtributoSimpleRule()); 
            pushFollow(FOLLOW_1);
            ruleAtributoSimple();

            state._fsp--;

             after(grammarAccess.getAtributoSimpleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAtributoSimple"


    // $ANTLR start "ruleAtributoSimple"
    // InternalMyDsl.g:212:1: ruleAtributoSimple : ( ( rule__AtributoSimple__Group__0 ) ) ;
    public final void ruleAtributoSimple() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__AtributoSimple__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__AtributoSimple__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__AtributoSimple__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__AtributoSimple__Group__0 )
            {
             before(grammarAccess.getAtributoSimpleAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__AtributoSimple__Group__0 )
            // InternalMyDsl.g:219:4: rule__AtributoSimple__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__AtributoSimple__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAtributoSimpleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAtributoSimple"


    // $ANTLR start "entryRuleMyString"
    // InternalMyDsl.g:228:1: entryRuleMyString : ruleMyString EOF ;
    public final void entryRuleMyString() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleMyString EOF )
            // InternalMyDsl.g:230:1: ruleMyString EOF
            {
             before(grammarAccess.getMyStringRule()); 
            pushFollow(FOLLOW_1);
            ruleMyString();

            state._fsp--;

             after(grammarAccess.getMyStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMyString"


    // $ANTLR start "ruleMyString"
    // InternalMyDsl.g:237:1: ruleMyString : ( ( rule__MyString__NameAssignment ) ) ;
    public final void ruleMyString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__MyString__NameAssignment ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__MyString__NameAssignment ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__MyString__NameAssignment ) )
            // InternalMyDsl.g:243:3: ( rule__MyString__NameAssignment )
            {
             before(grammarAccess.getMyStringAccess().getNameAssignment()); 
            // InternalMyDsl.g:244:3: ( rule__MyString__NameAssignment )
            // InternalMyDsl.g:244:4: rule__MyString__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__MyString__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMyStringAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMyString"


    // $ANTLR start "entryRuleMyNumeric"
    // InternalMyDsl.g:253:1: entryRuleMyNumeric : ruleMyNumeric EOF ;
    public final void entryRuleMyNumeric() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleMyNumeric EOF )
            // InternalMyDsl.g:255:1: ruleMyNumeric EOF
            {
             before(grammarAccess.getMyNumericRule()); 
            pushFollow(FOLLOW_1);
            ruleMyNumeric();

            state._fsp--;

             after(grammarAccess.getMyNumericRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMyNumeric"


    // $ANTLR start "ruleMyNumeric"
    // InternalMyDsl.g:262:1: ruleMyNumeric : ( ( rule__MyNumeric__NameAssignment ) ) ;
    public final void ruleMyNumeric() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__MyNumeric__NameAssignment ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__MyNumeric__NameAssignment ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__MyNumeric__NameAssignment ) )
            // InternalMyDsl.g:268:3: ( rule__MyNumeric__NameAssignment )
            {
             before(grammarAccess.getMyNumericAccess().getNameAssignment()); 
            // InternalMyDsl.g:269:3: ( rule__MyNumeric__NameAssignment )
            // InternalMyDsl.g:269:4: rule__MyNumeric__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__MyNumeric__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMyNumericAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMyNumeric"


    // $ANTLR start "entryRuleMyBoolean"
    // InternalMyDsl.g:278:1: entryRuleMyBoolean : ruleMyBoolean EOF ;
    public final void entryRuleMyBoolean() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleMyBoolean EOF )
            // InternalMyDsl.g:280:1: ruleMyBoolean EOF
            {
             before(grammarAccess.getMyBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleMyBoolean();

            state._fsp--;

             after(grammarAccess.getMyBooleanRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMyBoolean"


    // $ANTLR start "ruleMyBoolean"
    // InternalMyDsl.g:287:1: ruleMyBoolean : ( ( rule__MyBoolean__NameAssignment ) ) ;
    public final void ruleMyBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__MyBoolean__NameAssignment ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__MyBoolean__NameAssignment ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__MyBoolean__NameAssignment ) )
            // InternalMyDsl.g:293:3: ( rule__MyBoolean__NameAssignment )
            {
             before(grammarAccess.getMyBooleanAccess().getNameAssignment()); 
            // InternalMyDsl.g:294:3: ( rule__MyBoolean__NameAssignment )
            // InternalMyDsl.g:294:4: rule__MyBoolean__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__MyBoolean__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMyBooleanAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMyBoolean"


    // $ANTLR start "entryRuleMockarooEntity"
    // InternalMyDsl.g:303:1: entryRuleMockarooEntity : ruleMockarooEntity EOF ;
    public final void entryRuleMockarooEntity() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleMockarooEntity EOF )
            // InternalMyDsl.g:305:1: ruleMockarooEntity EOF
            {
             before(grammarAccess.getMockarooEntityRule()); 
            pushFollow(FOLLOW_1);
            ruleMockarooEntity();

            state._fsp--;

             after(grammarAccess.getMockarooEntityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMockarooEntity"


    // $ANTLR start "ruleMockarooEntity"
    // InternalMyDsl.g:312:1: ruleMockarooEntity : ( ( rule__MockarooEntity__Group__0 ) ) ;
    public final void ruleMockarooEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__MockarooEntity__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__MockarooEntity__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__MockarooEntity__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__MockarooEntity__Group__0 )
            {
             before(grammarAccess.getMockarooEntityAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__MockarooEntity__Group__0 )
            // InternalMyDsl.g:319:4: rule__MockarooEntity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MockarooEntity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMockarooEntityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMockarooEntity"


    // $ANTLR start "entryRuleServicioRest"
    // InternalMyDsl.g:328:1: entryRuleServicioRest : ruleServicioRest EOF ;
    public final void entryRuleServicioRest() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleServicioRest EOF )
            // InternalMyDsl.g:330:1: ruleServicioRest EOF
            {
             before(grammarAccess.getServicioRestRule()); 
            pushFollow(FOLLOW_1);
            ruleServicioRest();

            state._fsp--;

             after(grammarAccess.getServicioRestRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleServicioRest"


    // $ANTLR start "ruleServicioRest"
    // InternalMyDsl.g:337:1: ruleServicioRest : ( ( rule__ServicioRest__Group__0 ) ) ;
    public final void ruleServicioRest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__ServicioRest__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__ServicioRest__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__ServicioRest__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__ServicioRest__Group__0 )
            {
             before(grammarAccess.getServicioRestAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__ServicioRest__Group__0 )
            // InternalMyDsl.g:344:4: rule__ServicioRest__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ServicioRest__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getServicioRestAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleServicioRest"


    // $ANTLR start "entryRuleUrl"
    // InternalMyDsl.g:353:1: entryRuleUrl : ruleUrl EOF ;
    public final void entryRuleUrl() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleUrl EOF )
            // InternalMyDsl.g:355:1: ruleUrl EOF
            {
             before(grammarAccess.getUrlRule()); 
            pushFollow(FOLLOW_1);
            ruleUrl();

            state._fsp--;

             after(grammarAccess.getUrlRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUrl"


    // $ANTLR start "ruleUrl"
    // InternalMyDsl.g:362:1: ruleUrl : ( ( rule__Url__Group__0 ) ) ;
    public final void ruleUrl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__Url__Group__0 ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__Url__Group__0 ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__Url__Group__0 ) )
            // InternalMyDsl.g:368:3: ( rule__Url__Group__0 )
            {
             before(grammarAccess.getUrlAccess().getGroup()); 
            // InternalMyDsl.g:369:3: ( rule__Url__Group__0 )
            // InternalMyDsl.g:369:4: rule__Url__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Url__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUrlAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUrl"


    // $ANTLR start "entryRuleUrlExpresion"
    // InternalMyDsl.g:378:1: entryRuleUrlExpresion : ruleUrlExpresion EOF ;
    public final void entryRuleUrlExpresion() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleUrlExpresion EOF )
            // InternalMyDsl.g:380:1: ruleUrlExpresion EOF
            {
             before(grammarAccess.getUrlExpresionRule()); 
            pushFollow(FOLLOW_1);
            ruleUrlExpresion();

            state._fsp--;

             after(grammarAccess.getUrlExpresionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleUrlExpresion"


    // $ANTLR start "ruleUrlExpresion"
    // InternalMyDsl.g:387:1: ruleUrlExpresion : ( ( rule__UrlExpresion__Alternatives ) ) ;
    public final void ruleUrlExpresion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__UrlExpresion__Alternatives ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__UrlExpresion__Alternatives ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__UrlExpresion__Alternatives ) )
            // InternalMyDsl.g:393:3: ( rule__UrlExpresion__Alternatives )
            {
             before(grammarAccess.getUrlExpresionAccess().getAlternatives()); 
            // InternalMyDsl.g:394:3: ( rule__UrlExpresion__Alternatives )
            // InternalMyDsl.g:394:4: rule__UrlExpresion__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__UrlExpresion__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getUrlExpresionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleUrlExpresion"


    // $ANTLR start "entryRuleStringType"
    // InternalMyDsl.g:403:1: entryRuleStringType : ruleStringType EOF ;
    public final void entryRuleStringType() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleStringType EOF )
            // InternalMyDsl.g:405:1: ruleStringType EOF
            {
             before(grammarAccess.getStringTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleStringType();

            state._fsp--;

             after(grammarAccess.getStringTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleStringType"


    // $ANTLR start "ruleStringType"
    // InternalMyDsl.g:412:1: ruleStringType : ( ( rule__StringType__Group__0 ) ) ;
    public final void ruleStringType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__StringType__Group__0 ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__StringType__Group__0 ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__StringType__Group__0 ) )
            // InternalMyDsl.g:418:3: ( rule__StringType__Group__0 )
            {
             before(grammarAccess.getStringTypeAccess().getGroup()); 
            // InternalMyDsl.g:419:3: ( rule__StringType__Group__0 )
            // InternalMyDsl.g:419:4: rule__StringType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StringType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStringTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStringType"


    // $ANTLR start "entryRuleParametro"
    // InternalMyDsl.g:428:1: entryRuleParametro : ruleParametro EOF ;
    public final void entryRuleParametro() throws RecognitionException {
        try {
            // InternalMyDsl.g:429:1: ( ruleParametro EOF )
            // InternalMyDsl.g:430:1: ruleParametro EOF
            {
             before(grammarAccess.getParametroRule()); 
            pushFollow(FOLLOW_1);
            ruleParametro();

            state._fsp--;

             after(grammarAccess.getParametroRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParametro"


    // $ANTLR start "ruleParametro"
    // InternalMyDsl.g:437:1: ruleParametro : ( ( rule__Parametro__Alternatives ) ) ;
    public final void ruleParametro() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:2: ( ( ( rule__Parametro__Alternatives ) ) )
            // InternalMyDsl.g:442:2: ( ( rule__Parametro__Alternatives ) )
            {
            // InternalMyDsl.g:442:2: ( ( rule__Parametro__Alternatives ) )
            // InternalMyDsl.g:443:3: ( rule__Parametro__Alternatives )
            {
             before(grammarAccess.getParametroAccess().getAlternatives()); 
            // InternalMyDsl.g:444:3: ( rule__Parametro__Alternatives )
            // InternalMyDsl.g:444:4: rule__Parametro__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Parametro__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getParametroAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParametro"


    // $ANTLR start "entryRuleQueryParam"
    // InternalMyDsl.g:453:1: entryRuleQueryParam : ruleQueryParam EOF ;
    public final void entryRuleQueryParam() throws RecognitionException {
        try {
            // InternalMyDsl.g:454:1: ( ruleQueryParam EOF )
            // InternalMyDsl.g:455:1: ruleQueryParam EOF
            {
             before(grammarAccess.getQueryParamRule()); 
            pushFollow(FOLLOW_1);
            ruleQueryParam();

            state._fsp--;

             after(grammarAccess.getQueryParamRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQueryParam"


    // $ANTLR start "ruleQueryParam"
    // InternalMyDsl.g:462:1: ruleQueryParam : ( ( rule__QueryParam__Group__0 ) ) ;
    public final void ruleQueryParam() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:2: ( ( ( rule__QueryParam__Group__0 ) ) )
            // InternalMyDsl.g:467:2: ( ( rule__QueryParam__Group__0 ) )
            {
            // InternalMyDsl.g:467:2: ( ( rule__QueryParam__Group__0 ) )
            // InternalMyDsl.g:468:3: ( rule__QueryParam__Group__0 )
            {
             before(grammarAccess.getQueryParamAccess().getGroup()); 
            // InternalMyDsl.g:469:3: ( rule__QueryParam__Group__0 )
            // InternalMyDsl.g:469:4: rule__QueryParam__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QueryParam__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQueryParamAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQueryParam"


    // $ANTLR start "entryRulePathParam"
    // InternalMyDsl.g:478:1: entryRulePathParam : rulePathParam EOF ;
    public final void entryRulePathParam() throws RecognitionException {
        try {
            // InternalMyDsl.g:479:1: ( rulePathParam EOF )
            // InternalMyDsl.g:480:1: rulePathParam EOF
            {
             before(grammarAccess.getPathParamRule()); 
            pushFollow(FOLLOW_1);
            rulePathParam();

            state._fsp--;

             after(grammarAccess.getPathParamRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePathParam"


    // $ANTLR start "rulePathParam"
    // InternalMyDsl.g:487:1: rulePathParam : ( ( rule__PathParam__Group__0 ) ) ;
    public final void rulePathParam() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:2: ( ( ( rule__PathParam__Group__0 ) ) )
            // InternalMyDsl.g:492:2: ( ( rule__PathParam__Group__0 ) )
            {
            // InternalMyDsl.g:492:2: ( ( rule__PathParam__Group__0 ) )
            // InternalMyDsl.g:493:3: ( rule__PathParam__Group__0 )
            {
             before(grammarAccess.getPathParamAccess().getGroup()); 
            // InternalMyDsl.g:494:3: ( rule__PathParam__Group__0 )
            // InternalMyDsl.g:494:4: rule__PathParam__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PathParam__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPathParamAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePathParam"


    // $ANTLR start "entryRuleResponse"
    // InternalMyDsl.g:503:1: entryRuleResponse : ruleResponse EOF ;
    public final void entryRuleResponse() throws RecognitionException {
        try {
            // InternalMyDsl.g:504:1: ( ruleResponse EOF )
            // InternalMyDsl.g:505:1: ruleResponse EOF
            {
             before(grammarAccess.getResponseRule()); 
            pushFollow(FOLLOW_1);
            ruleResponse();

            state._fsp--;

             after(grammarAccess.getResponseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleResponse"


    // $ANTLR start "ruleResponse"
    // InternalMyDsl.g:512:1: ruleResponse : ( ( rule__Response__Group__0 ) ) ;
    public final void ruleResponse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:516:2: ( ( ( rule__Response__Group__0 ) ) )
            // InternalMyDsl.g:517:2: ( ( rule__Response__Group__0 ) )
            {
            // InternalMyDsl.g:517:2: ( ( rule__Response__Group__0 ) )
            // InternalMyDsl.g:518:3: ( rule__Response__Group__0 )
            {
             before(grammarAccess.getResponseAccess().getGroup()); 
            // InternalMyDsl.g:519:3: ( rule__Response__Group__0 )
            // InternalMyDsl.g:519:4: rule__Response__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Response__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getResponseAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleResponse"


    // $ANTLR start "entryRuleRequest"
    // InternalMyDsl.g:528:1: entryRuleRequest : ruleRequest EOF ;
    public final void entryRuleRequest() throws RecognitionException {
        try {
            // InternalMyDsl.g:529:1: ( ruleRequest EOF )
            // InternalMyDsl.g:530:1: ruleRequest EOF
            {
             before(grammarAccess.getRequestRule()); 
            pushFollow(FOLLOW_1);
            ruleRequest();

            state._fsp--;

             after(grammarAccess.getRequestRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRequest"


    // $ANTLR start "ruleRequest"
    // InternalMyDsl.g:537:1: ruleRequest : ( ( rule__Request__Group__0 ) ) ;
    public final void ruleRequest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:541:2: ( ( ( rule__Request__Group__0 ) ) )
            // InternalMyDsl.g:542:2: ( ( rule__Request__Group__0 ) )
            {
            // InternalMyDsl.g:542:2: ( ( rule__Request__Group__0 ) )
            // InternalMyDsl.g:543:3: ( rule__Request__Group__0 )
            {
             before(grammarAccess.getRequestAccess().getGroup()); 
            // InternalMyDsl.g:544:3: ( rule__Request__Group__0 )
            // InternalMyDsl.g:544:4: rule__Request__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Request__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRequestAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRequest"


    // $ANTLR start "entryRulePrimitiveType"
    // InternalMyDsl.g:553:1: entryRulePrimitiveType : rulePrimitiveType EOF ;
    public final void entryRulePrimitiveType() throws RecognitionException {
        try {
            // InternalMyDsl.g:554:1: ( rulePrimitiveType EOF )
            // InternalMyDsl.g:555:1: rulePrimitiveType EOF
            {
             before(grammarAccess.getPrimitiveTypeRule()); 
            pushFollow(FOLLOW_1);
            rulePrimitiveType();

            state._fsp--;

             after(grammarAccess.getPrimitiveTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimitiveType"


    // $ANTLR start "rulePrimitiveType"
    // InternalMyDsl.g:562:1: rulePrimitiveType : ( ( rule__PrimitiveType__NameAssignment ) ) ;
    public final void rulePrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:566:2: ( ( ( rule__PrimitiveType__NameAssignment ) ) )
            // InternalMyDsl.g:567:2: ( ( rule__PrimitiveType__NameAssignment ) )
            {
            // InternalMyDsl.g:567:2: ( ( rule__PrimitiveType__NameAssignment ) )
            // InternalMyDsl.g:568:3: ( rule__PrimitiveType__NameAssignment )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getNameAssignment()); 
            // InternalMyDsl.g:569:3: ( rule__PrimitiveType__NameAssignment )
            // InternalMyDsl.g:569:4: rule__PrimitiveType__NameAssignment
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveType__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypeAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "entryRuleDatoPrimitivo"
    // InternalMyDsl.g:578:1: entryRuleDatoPrimitivo : ruleDatoPrimitivo EOF ;
    public final void entryRuleDatoPrimitivo() throws RecognitionException {
        try {
            // InternalMyDsl.g:579:1: ( ruleDatoPrimitivo EOF )
            // InternalMyDsl.g:580:1: ruleDatoPrimitivo EOF
            {
             before(grammarAccess.getDatoPrimitivoRule()); 
            pushFollow(FOLLOW_1);
            ruleDatoPrimitivo();

            state._fsp--;

             after(grammarAccess.getDatoPrimitivoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDatoPrimitivo"


    // $ANTLR start "ruleDatoPrimitivo"
    // InternalMyDsl.g:587:1: ruleDatoPrimitivo : ( ( rule__DatoPrimitivo__Alternatives ) ) ;
    public final void ruleDatoPrimitivo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:591:2: ( ( ( rule__DatoPrimitivo__Alternatives ) ) )
            // InternalMyDsl.g:592:2: ( ( rule__DatoPrimitivo__Alternatives ) )
            {
            // InternalMyDsl.g:592:2: ( ( rule__DatoPrimitivo__Alternatives ) )
            // InternalMyDsl.g:593:3: ( rule__DatoPrimitivo__Alternatives )
            {
             before(grammarAccess.getDatoPrimitivoAccess().getAlternatives()); 
            // InternalMyDsl.g:594:3: ( rule__DatoPrimitivo__Alternatives )
            // InternalMyDsl.g:594:4: rule__DatoPrimitivo__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__DatoPrimitivo__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDatoPrimitivoAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDatoPrimitivo"


    // $ANTLR start "entryRuleTest"
    // InternalMyDsl.g:603:1: entryRuleTest : ruleTest EOF ;
    public final void entryRuleTest() throws RecognitionException {
        try {
            // InternalMyDsl.g:604:1: ( ruleTest EOF )
            // InternalMyDsl.g:605:1: ruleTest EOF
            {
             before(grammarAccess.getTestRule()); 
            pushFollow(FOLLOW_1);
            ruleTest();

            state._fsp--;

             after(grammarAccess.getTestRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTest"


    // $ANTLR start "ruleTest"
    // InternalMyDsl.g:612:1: ruleTest : ( ( rule__Test__Group__0 ) ) ;
    public final void ruleTest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:616:2: ( ( ( rule__Test__Group__0 ) ) )
            // InternalMyDsl.g:617:2: ( ( rule__Test__Group__0 ) )
            {
            // InternalMyDsl.g:617:2: ( ( rule__Test__Group__0 ) )
            // InternalMyDsl.g:618:3: ( rule__Test__Group__0 )
            {
             before(grammarAccess.getTestAccess().getGroup()); 
            // InternalMyDsl.g:619:3: ( rule__Test__Group__0 )
            // InternalMyDsl.g:619:4: rule__Test__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Test__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTest"


    // $ANTLR start "entryRuleMapping"
    // InternalMyDsl.g:628:1: entryRuleMapping : ruleMapping EOF ;
    public final void entryRuleMapping() throws RecognitionException {
        try {
            // InternalMyDsl.g:629:1: ( ruleMapping EOF )
            // InternalMyDsl.g:630:1: ruleMapping EOF
            {
             before(grammarAccess.getMappingRule()); 
            pushFollow(FOLLOW_1);
            ruleMapping();

            state._fsp--;

             after(grammarAccess.getMappingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMapping"


    // $ANTLR start "ruleMapping"
    // InternalMyDsl.g:637:1: ruleMapping : ( ( rule__Mapping__Group__0 ) ) ;
    public final void ruleMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:641:2: ( ( ( rule__Mapping__Group__0 ) ) )
            // InternalMyDsl.g:642:2: ( ( rule__Mapping__Group__0 ) )
            {
            // InternalMyDsl.g:642:2: ( ( rule__Mapping__Group__0 ) )
            // InternalMyDsl.g:643:3: ( rule__Mapping__Group__0 )
            {
             before(grammarAccess.getMappingAccess().getGroup()); 
            // InternalMyDsl.g:644:3: ( rule__Mapping__Group__0 )
            // InternalMyDsl.g:644:4: rule__Mapping__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Mapping__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMapping"


    // $ANTLR start "entryRuleAsercion"
    // InternalMyDsl.g:653:1: entryRuleAsercion : ruleAsercion EOF ;
    public final void entryRuleAsercion() throws RecognitionException {
        try {
            // InternalMyDsl.g:654:1: ( ruleAsercion EOF )
            // InternalMyDsl.g:655:1: ruleAsercion EOF
            {
             before(grammarAccess.getAsercionRule()); 
            pushFollow(FOLLOW_1);
            ruleAsercion();

            state._fsp--;

             after(grammarAccess.getAsercionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAsercion"


    // $ANTLR start "ruleAsercion"
    // InternalMyDsl.g:662:1: ruleAsercion : ( ( rule__Asercion__Group__0 ) ) ;
    public final void ruleAsercion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:666:2: ( ( ( rule__Asercion__Group__0 ) ) )
            // InternalMyDsl.g:667:2: ( ( rule__Asercion__Group__0 ) )
            {
            // InternalMyDsl.g:667:2: ( ( rule__Asercion__Group__0 ) )
            // InternalMyDsl.g:668:3: ( rule__Asercion__Group__0 )
            {
             before(grammarAccess.getAsercionAccess().getGroup()); 
            // InternalMyDsl.g:669:3: ( rule__Asercion__Group__0 )
            // InternalMyDsl.g:669:4: rule__Asercion__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Asercion__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAsercionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAsercion"


    // $ANTLR start "entryRuleElementoStatus"
    // InternalMyDsl.g:678:1: entryRuleElementoStatus : ruleElementoStatus EOF ;
    public final void entryRuleElementoStatus() throws RecognitionException {
        try {
            // InternalMyDsl.g:679:1: ( ruleElementoStatus EOF )
            // InternalMyDsl.g:680:1: ruleElementoStatus EOF
            {
             before(grammarAccess.getElementoStatusRule()); 
            pushFollow(FOLLOW_1);
            ruleElementoStatus();

            state._fsp--;

             after(grammarAccess.getElementoStatusRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElementoStatus"


    // $ANTLR start "ruleElementoStatus"
    // InternalMyDsl.g:687:1: ruleElementoStatus : ( ( rule__ElementoStatus__TipoAssignment ) ) ;
    public final void ruleElementoStatus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:691:2: ( ( ( rule__ElementoStatus__TipoAssignment ) ) )
            // InternalMyDsl.g:692:2: ( ( rule__ElementoStatus__TipoAssignment ) )
            {
            // InternalMyDsl.g:692:2: ( ( rule__ElementoStatus__TipoAssignment ) )
            // InternalMyDsl.g:693:3: ( rule__ElementoStatus__TipoAssignment )
            {
             before(grammarAccess.getElementoStatusAccess().getTipoAssignment()); 
            // InternalMyDsl.g:694:3: ( rule__ElementoStatus__TipoAssignment )
            // InternalMyDsl.g:694:4: rule__ElementoStatus__TipoAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ElementoStatus__TipoAssignment();

            state._fsp--;


            }

             after(grammarAccess.getElementoStatusAccess().getTipoAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElementoStatus"


    // $ANTLR start "entryRuleElementoResponse"
    // InternalMyDsl.g:703:1: entryRuleElementoResponse : ruleElementoResponse EOF ;
    public final void entryRuleElementoResponse() throws RecognitionException {
        try {
            // InternalMyDsl.g:704:1: ( ruleElementoResponse EOF )
            // InternalMyDsl.g:705:1: ruleElementoResponse EOF
            {
             before(grammarAccess.getElementoResponseRule()); 
            pushFollow(FOLLOW_1);
            ruleElementoResponse();

            state._fsp--;

             after(grammarAccess.getElementoResponseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElementoResponse"


    // $ANTLR start "ruleElementoResponse"
    // InternalMyDsl.g:712:1: ruleElementoResponse : ( ( rule__ElementoResponse__TipoAssignment ) ) ;
    public final void ruleElementoResponse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:716:2: ( ( ( rule__ElementoResponse__TipoAssignment ) ) )
            // InternalMyDsl.g:717:2: ( ( rule__ElementoResponse__TipoAssignment ) )
            {
            // InternalMyDsl.g:717:2: ( ( rule__ElementoResponse__TipoAssignment ) )
            // InternalMyDsl.g:718:3: ( rule__ElementoResponse__TipoAssignment )
            {
             before(grammarAccess.getElementoResponseAccess().getTipoAssignment()); 
            // InternalMyDsl.g:719:3: ( rule__ElementoResponse__TipoAssignment )
            // InternalMyDsl.g:719:4: rule__ElementoResponse__TipoAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ElementoResponse__TipoAssignment();

            state._fsp--;


            }

             after(grammarAccess.getElementoResponseAccess().getTipoAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElementoResponse"


    // $ANTLR start "entryRuleElementoAtributo"
    // InternalMyDsl.g:728:1: entryRuleElementoAtributo : ruleElementoAtributo EOF ;
    public final void entryRuleElementoAtributo() throws RecognitionException {
        try {
            // InternalMyDsl.g:729:1: ( ruleElementoAtributo EOF )
            // InternalMyDsl.g:730:1: ruleElementoAtributo EOF
            {
             before(grammarAccess.getElementoAtributoRule()); 
            pushFollow(FOLLOW_1);
            ruleElementoAtributo();

            state._fsp--;

             after(grammarAccess.getElementoAtributoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElementoAtributo"


    // $ANTLR start "ruleElementoAtributo"
    // InternalMyDsl.g:737:1: ruleElementoAtributo : ( ( rule__ElementoAtributo__AtributoAssignment ) ) ;
    public final void ruleElementoAtributo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:741:2: ( ( ( rule__ElementoAtributo__AtributoAssignment ) ) )
            // InternalMyDsl.g:742:2: ( ( rule__ElementoAtributo__AtributoAssignment ) )
            {
            // InternalMyDsl.g:742:2: ( ( rule__ElementoAtributo__AtributoAssignment ) )
            // InternalMyDsl.g:743:3: ( rule__ElementoAtributo__AtributoAssignment )
            {
             before(grammarAccess.getElementoAtributoAccess().getAtributoAssignment()); 
            // InternalMyDsl.g:744:3: ( rule__ElementoAtributo__AtributoAssignment )
            // InternalMyDsl.g:744:4: rule__ElementoAtributo__AtributoAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ElementoAtributo__AtributoAssignment();

            state._fsp--;


            }

             after(grammarAccess.getElementoAtributoAccess().getAtributoAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElementoAtributo"


    // $ANTLR start "entryRuleElementoParametro"
    // InternalMyDsl.g:753:1: entryRuleElementoParametro : ruleElementoParametro EOF ;
    public final void entryRuleElementoParametro() throws RecognitionException {
        try {
            // InternalMyDsl.g:754:1: ( ruleElementoParametro EOF )
            // InternalMyDsl.g:755:1: ruleElementoParametro EOF
            {
             before(grammarAccess.getElementoParametroRule()); 
            pushFollow(FOLLOW_1);
            ruleElementoParametro();

            state._fsp--;

             after(grammarAccess.getElementoParametroRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElementoParametro"


    // $ANTLR start "ruleElementoParametro"
    // InternalMyDsl.g:762:1: ruleElementoParametro : ( ( rule__ElementoParametro__ParametroAssignment ) ) ;
    public final void ruleElementoParametro() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:766:2: ( ( ( rule__ElementoParametro__ParametroAssignment ) ) )
            // InternalMyDsl.g:767:2: ( ( rule__ElementoParametro__ParametroAssignment ) )
            {
            // InternalMyDsl.g:767:2: ( ( rule__ElementoParametro__ParametroAssignment ) )
            // InternalMyDsl.g:768:3: ( rule__ElementoParametro__ParametroAssignment )
            {
             before(grammarAccess.getElementoParametroAccess().getParametroAssignment()); 
            // InternalMyDsl.g:769:3: ( rule__ElementoParametro__ParametroAssignment )
            // InternalMyDsl.g:769:4: rule__ElementoParametro__ParametroAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ElementoParametro__ParametroAssignment();

            state._fsp--;


            }

             after(grammarAccess.getElementoParametroAccess().getParametroAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElementoParametro"


    // $ANTLR start "entryRuleElementoPrimitivo"
    // InternalMyDsl.g:778:1: entryRuleElementoPrimitivo : ruleElementoPrimitivo EOF ;
    public final void entryRuleElementoPrimitivo() throws RecognitionException {
        try {
            // InternalMyDsl.g:779:1: ( ruleElementoPrimitivo EOF )
            // InternalMyDsl.g:780:1: ruleElementoPrimitivo EOF
            {
             before(grammarAccess.getElementoPrimitivoRule()); 
            pushFollow(FOLLOW_1);
            ruleElementoPrimitivo();

            state._fsp--;

             after(grammarAccess.getElementoPrimitivoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleElementoPrimitivo"


    // $ANTLR start "ruleElementoPrimitivo"
    // InternalMyDsl.g:787:1: ruleElementoPrimitivo : ( ( rule__ElementoPrimitivo__ElementoPrimitivoAssignment ) ) ;
    public final void ruleElementoPrimitivo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:791:2: ( ( ( rule__ElementoPrimitivo__ElementoPrimitivoAssignment ) ) )
            // InternalMyDsl.g:792:2: ( ( rule__ElementoPrimitivo__ElementoPrimitivoAssignment ) )
            {
            // InternalMyDsl.g:792:2: ( ( rule__ElementoPrimitivo__ElementoPrimitivoAssignment ) )
            // InternalMyDsl.g:793:3: ( rule__ElementoPrimitivo__ElementoPrimitivoAssignment )
            {
             before(grammarAccess.getElementoPrimitivoAccess().getElementoPrimitivoAssignment()); 
            // InternalMyDsl.g:794:3: ( rule__ElementoPrimitivo__ElementoPrimitivoAssignment )
            // InternalMyDsl.g:794:4: rule__ElementoPrimitivo__ElementoPrimitivoAssignment
            {
            pushFollow(FOLLOW_2);
            rule__ElementoPrimitivo__ElementoPrimitivoAssignment();

            state._fsp--;


            }

             after(grammarAccess.getElementoPrimitivoAccess().getElementoPrimitivoAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleElementoPrimitivo"


    // $ANTLR start "entryRuleEBoolean"
    // InternalMyDsl.g:803:1: entryRuleEBoolean : ruleEBoolean EOF ;
    public final void entryRuleEBoolean() throws RecognitionException {
        try {
            // InternalMyDsl.g:804:1: ( ruleEBoolean EOF )
            // InternalMyDsl.g:805:1: ruleEBoolean EOF
            {
             before(grammarAccess.getEBooleanRule()); 
            pushFollow(FOLLOW_1);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getEBooleanRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEBoolean"


    // $ANTLR start "ruleEBoolean"
    // InternalMyDsl.g:812:1: ruleEBoolean : ( ( rule__EBoolean__Alternatives ) ) ;
    public final void ruleEBoolean() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:816:2: ( ( ( rule__EBoolean__Alternatives ) ) )
            // InternalMyDsl.g:817:2: ( ( rule__EBoolean__Alternatives ) )
            {
            // InternalMyDsl.g:817:2: ( ( rule__EBoolean__Alternatives ) )
            // InternalMyDsl.g:818:3: ( rule__EBoolean__Alternatives )
            {
             before(grammarAccess.getEBooleanAccess().getAlternatives()); 
            // InternalMyDsl.g:819:3: ( rule__EBoolean__Alternatives )
            // InternalMyDsl.g:819:4: rule__EBoolean__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EBoolean__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEBooleanAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEBoolean"


    // $ANTLR start "entryRuleEInt"
    // InternalMyDsl.g:828:1: entryRuleEInt : ruleEInt EOF ;
    public final void entryRuleEInt() throws RecognitionException {
        try {
            // InternalMyDsl.g:829:1: ( ruleEInt EOF )
            // InternalMyDsl.g:830:1: ruleEInt EOF
            {
             before(grammarAccess.getEIntRule()); 
            pushFollow(FOLLOW_1);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getEIntRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEInt"


    // $ANTLR start "ruleEInt"
    // InternalMyDsl.g:837:1: ruleEInt : ( RULE_INT ) ;
    public final void ruleEInt() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:841:2: ( ( RULE_INT ) )
            // InternalMyDsl.g:842:2: ( RULE_INT )
            {
            // InternalMyDsl.g:842:2: ( RULE_INT )
            // InternalMyDsl.g:843:3: RULE_INT
            {
             before(grammarAccess.getEIntAccess().getINTTerminalRuleCall()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEIntAccess().getINTTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:853:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMyDsl.g:854:1: ( ruleEString EOF )
            // InternalMyDsl.g:855:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:862:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:866:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMyDsl.g:867:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMyDsl.g:867:2: ( ( rule__EString__Alternatives ) )
            // InternalMyDsl.g:868:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalMyDsl.g:869:3: ( rule__EString__Alternatives )
            // InternalMyDsl.g:869:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalMyDsl.g:878:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalMyDsl.g:879:1: ( ruleQualifiedName EOF )
            // InternalMyDsl.g:880:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalMyDsl.g:887:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:891:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalMyDsl.g:892:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalMyDsl.g:892:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalMyDsl.g:893:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalMyDsl.g:894:3: ( rule__QualifiedName__Group__0 )
            // InternalMyDsl.g:894:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "ruleTipoAtributo"
    // InternalMyDsl.g:903:1: ruleTipoAtributo : ( ( rule__TipoAtributo__Alternatives ) ) ;
    public final void ruleTipoAtributo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:907:1: ( ( ( rule__TipoAtributo__Alternatives ) ) )
            // InternalMyDsl.g:908:2: ( ( rule__TipoAtributo__Alternatives ) )
            {
            // InternalMyDsl.g:908:2: ( ( rule__TipoAtributo__Alternatives ) )
            // InternalMyDsl.g:909:3: ( rule__TipoAtributo__Alternatives )
            {
             before(grammarAccess.getTipoAtributoAccess().getAlternatives()); 
            // InternalMyDsl.g:910:3: ( rule__TipoAtributo__Alternatives )
            // InternalMyDsl.g:910:4: rule__TipoAtributo__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TipoAtributo__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTipoAtributoAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTipoAtributo"


    // $ANTLR start "ruleOperador"
    // InternalMyDsl.g:919:1: ruleOperador : ( ( rule__Operador__Alternatives ) ) ;
    public final void ruleOperador() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:923:1: ( ( ( rule__Operador__Alternatives ) ) )
            // InternalMyDsl.g:924:2: ( ( rule__Operador__Alternatives ) )
            {
            // InternalMyDsl.g:924:2: ( ( rule__Operador__Alternatives ) )
            // InternalMyDsl.g:925:3: ( rule__Operador__Alternatives )
            {
             before(grammarAccess.getOperadorAccess().getAlternatives()); 
            // InternalMyDsl.g:926:3: ( rule__Operador__Alternatives )
            // InternalMyDsl.g:926:4: rule__Operador__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Operador__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getOperadorAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOperador"


    // $ANTLR start "ruleMockaroo"
    // InternalMyDsl.g:935:1: ruleMockaroo : ( ( rule__Mockaroo__Alternatives ) ) ;
    public final void ruleMockaroo() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:939:1: ( ( ( rule__Mockaroo__Alternatives ) ) )
            // InternalMyDsl.g:940:2: ( ( rule__Mockaroo__Alternatives ) )
            {
            // InternalMyDsl.g:940:2: ( ( rule__Mockaroo__Alternatives ) )
            // InternalMyDsl.g:941:3: ( rule__Mockaroo__Alternatives )
            {
             before(grammarAccess.getMockarooAccess().getAlternatives()); 
            // InternalMyDsl.g:942:3: ( rule__Mockaroo__Alternatives )
            // InternalMyDsl.g:942:4: rule__Mockaroo__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Mockaroo__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMockarooAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMockaroo"


    // $ANTLR start "ruleTipoMetodoRest"
    // InternalMyDsl.g:951:1: ruleTipoMetodoRest : ( ( rule__TipoMetodoRest__Alternatives ) ) ;
    public final void ruleTipoMetodoRest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:955:1: ( ( ( rule__TipoMetodoRest__Alternatives ) ) )
            // InternalMyDsl.g:956:2: ( ( rule__TipoMetodoRest__Alternatives ) )
            {
            // InternalMyDsl.g:956:2: ( ( rule__TipoMetodoRest__Alternatives ) )
            // InternalMyDsl.g:957:3: ( rule__TipoMetodoRest__Alternatives )
            {
             before(grammarAccess.getTipoMetodoRestAccess().getAlternatives()); 
            // InternalMyDsl.g:958:3: ( rule__TipoMetodoRest__Alternatives )
            // InternalMyDsl.g:958:4: rule__TipoMetodoRest__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TipoMetodoRest__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTipoMetodoRestAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTipoMetodoRest"


    // $ANTLR start "rule__Entidad__Alternatives"
    // InternalMyDsl.g:966:1: rule__Entidad__Alternatives : ( ( ruleSimpleEntity ) | ( ruleMockarooEntity ) );
    public final void rule__Entidad__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:970:1: ( ( ruleSimpleEntity ) | ( ruleMockarooEntity ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==42) ) {
                alt1=1;
            }
            else if ( (LA1_0==50) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:971:2: ( ruleSimpleEntity )
                    {
                    // InternalMyDsl.g:971:2: ( ruleSimpleEntity )
                    // InternalMyDsl.g:972:3: ruleSimpleEntity
                    {
                     before(grammarAccess.getEntidadAccess().getSimpleEntityParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleSimpleEntity();

                    state._fsp--;

                     after(grammarAccess.getEntidadAccess().getSimpleEntityParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:977:2: ( ruleMockarooEntity )
                    {
                    // InternalMyDsl.g:977:2: ( ruleMockarooEntity )
                    // InternalMyDsl.g:978:3: ruleMockarooEntity
                    {
                     before(grammarAccess.getEntidadAccess().getMockarooEntityParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMockarooEntity();

                    state._fsp--;

                     after(grammarAccess.getEntidadAccess().getMockarooEntityParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Entidad__Alternatives"


    // $ANTLR start "rule__Atributo__Alternatives"
    // InternalMyDsl.g:987:1: rule__Atributo__Alternatives : ( ( ruleAtributoMocka ) | ( ruleAtributoArreglo ) | ( ruleAtributoSimple ) );
    public final void rule__Atributo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:991:1: ( ( ruleAtributoMocka ) | ( ruleAtributoArreglo ) | ( ruleAtributoSimple ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                int LA2_1 = input.LA(2);

                if ( (LA2_1==RULE_ID) ) {
                    int LA2_4 = input.LA(3);

                    if ( (LA2_4==RULE_SEMICOLON) ) {
                        alt2=3;
                    }
                    else if ( (LA2_4==45) ) {
                        alt2=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 4, input);

                        throw nvae;
                    }
                }
                else if ( (LA2_1==48) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;
                }
                }
                break;
            case 16:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==RULE_ID) ) {
                    int LA2_4 = input.LA(3);

                    if ( (LA2_4==RULE_SEMICOLON) ) {
                        alt2=3;
                    }
                    else if ( (LA2_4==45) ) {
                        alt2=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 4, input);

                        throw nvae;
                    }
                }
                else if ( (LA2_2==48) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;
                }
                }
                break;
            case 17:
                {
                int LA2_3 = input.LA(2);

                if ( (LA2_3==RULE_ID) ) {
                    int LA2_4 = input.LA(3);

                    if ( (LA2_4==RULE_SEMICOLON) ) {
                        alt2=3;
                    }
                    else if ( (LA2_4==45) ) {
                        alt2=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 4, input);

                        throw nvae;
                    }
                }
                else if ( (LA2_3==48) ) {
                    alt2=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:992:2: ( ruleAtributoMocka )
                    {
                    // InternalMyDsl.g:992:2: ( ruleAtributoMocka )
                    // InternalMyDsl.g:993:3: ruleAtributoMocka
                    {
                     before(grammarAccess.getAtributoAccess().getAtributoMockaParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAtributoMocka();

                    state._fsp--;

                     after(grammarAccess.getAtributoAccess().getAtributoMockaParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:998:2: ( ruleAtributoArreglo )
                    {
                    // InternalMyDsl.g:998:2: ( ruleAtributoArreglo )
                    // InternalMyDsl.g:999:3: ruleAtributoArreglo
                    {
                     before(grammarAccess.getAtributoAccess().getAtributoArregloParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleAtributoArreglo();

                    state._fsp--;

                     after(grammarAccess.getAtributoAccess().getAtributoArregloParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1004:2: ( ruleAtributoSimple )
                    {
                    // InternalMyDsl.g:1004:2: ( ruleAtributoSimple )
                    // InternalMyDsl.g:1005:3: ruleAtributoSimple
                    {
                     before(grammarAccess.getAtributoAccess().getAtributoSimpleParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAtributoSimple();

                    state._fsp--;

                     after(grammarAccess.getAtributoAccess().getAtributoSimpleParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atributo__Alternatives"


    // $ANTLR start "rule__AtributoMocka__Alternatives_2_1"
    // InternalMyDsl.g:1014:1: rule__AtributoMocka__Alternatives_2_1 : ( ( ( rule__AtributoMocka__Group_2_1_0__0 ) ) | ( ( rule__AtributoMocka__Group_2_1_1__0 ) ) );
    public final void rule__AtributoMocka__Alternatives_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1018:1: ( ( ( rule__AtributoMocka__Group_2_1_0__0 ) ) | ( ( rule__AtributoMocka__Group_2_1_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==71) ) {
                alt3=1;
            }
            else if ( (LA3_0==47) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:1019:2: ( ( rule__AtributoMocka__Group_2_1_0__0 ) )
                    {
                    // InternalMyDsl.g:1019:2: ( ( rule__AtributoMocka__Group_2_1_0__0 ) )
                    // InternalMyDsl.g:1020:3: ( rule__AtributoMocka__Group_2_1_0__0 )
                    {
                     before(grammarAccess.getAtributoMockaAccess().getGroup_2_1_0()); 
                    // InternalMyDsl.g:1021:3: ( rule__AtributoMocka__Group_2_1_0__0 )
                    // InternalMyDsl.g:1021:4: rule__AtributoMocka__Group_2_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AtributoMocka__Group_2_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtributoMockaAccess().getGroup_2_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1025:2: ( ( rule__AtributoMocka__Group_2_1_1__0 ) )
                    {
                    // InternalMyDsl.g:1025:2: ( ( rule__AtributoMocka__Group_2_1_1__0 ) )
                    // InternalMyDsl.g:1026:3: ( rule__AtributoMocka__Group_2_1_1__0 )
                    {
                     before(grammarAccess.getAtributoMockaAccess().getGroup_2_1_1()); 
                    // InternalMyDsl.g:1027:3: ( rule__AtributoMocka__Group_2_1_1__0 )
                    // InternalMyDsl.g:1027:4: rule__AtributoMocka__Group_2_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__AtributoMocka__Group_2_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtributoMockaAccess().getGroup_2_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Alternatives_2_1"


    // $ANTLR start "rule__UrlExpresion__Alternatives"
    // InternalMyDsl.g:1035:1: rule__UrlExpresion__Alternatives : ( ( ruleStringType ) | ( ruleParametro ) );
    public final void rule__UrlExpresion__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1039:1: ( ( ruleStringType ) | ( ruleParametro ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==52) ) {
                alt4=1;
            }
            else if ( ((LA4_0>=53 && LA4_0<=55)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:1040:2: ( ruleStringType )
                    {
                    // InternalMyDsl.g:1040:2: ( ruleStringType )
                    // InternalMyDsl.g:1041:3: ruleStringType
                    {
                     before(grammarAccess.getUrlExpresionAccess().getStringTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleStringType();

                    state._fsp--;

                     after(grammarAccess.getUrlExpresionAccess().getStringTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1046:2: ( ruleParametro )
                    {
                    // InternalMyDsl.g:1046:2: ( ruleParametro )
                    // InternalMyDsl.g:1047:3: ruleParametro
                    {
                     before(grammarAccess.getUrlExpresionAccess().getParametroParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleParametro();

                    state._fsp--;

                     after(grammarAccess.getUrlExpresionAccess().getParametroParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__UrlExpresion__Alternatives"


    // $ANTLR start "rule__Parametro__Alternatives"
    // InternalMyDsl.g:1056:1: rule__Parametro__Alternatives : ( ( ruleQueryParam ) | ( rulePathParam ) );
    public final void rule__Parametro__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1060:1: ( ( ruleQueryParam ) | ( rulePathParam ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=53 && LA5_0<=54)) ) {
                alt5=1;
            }
            else if ( (LA5_0==55) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:1061:2: ( ruleQueryParam )
                    {
                    // InternalMyDsl.g:1061:2: ( ruleQueryParam )
                    // InternalMyDsl.g:1062:3: ruleQueryParam
                    {
                     before(grammarAccess.getParametroAccess().getQueryParamParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleQueryParam();

                    state._fsp--;

                     after(grammarAccess.getParametroAccess().getQueryParamParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1067:2: ( rulePathParam )
                    {
                    // InternalMyDsl.g:1067:2: ( rulePathParam )
                    // InternalMyDsl.g:1068:3: rulePathParam
                    {
                     before(grammarAccess.getParametroAccess().getPathParamParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePathParam();

                    state._fsp--;

                     after(grammarAccess.getParametroAccess().getPathParamParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parametro__Alternatives"


    // $ANTLR start "rule__Response__Alternatives_4"
    // InternalMyDsl.g:1077:1: rule__Response__Alternatives_4 : ( ( ( rule__Response__TipoEntidadAssignment_4_0 ) ) | ( ( rule__Response__TipoPrimitivoAssignment_4_1 ) ) );
    public final void rule__Response__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1081:1: ( ( ( rule__Response__TipoEntidadAssignment_4_0 ) ) | ( ( rule__Response__TipoPrimitivoAssignment_4_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( ((LA6_0>=15 && LA6_0<=17)) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:1082:2: ( ( rule__Response__TipoEntidadAssignment_4_0 ) )
                    {
                    // InternalMyDsl.g:1082:2: ( ( rule__Response__TipoEntidadAssignment_4_0 ) )
                    // InternalMyDsl.g:1083:3: ( rule__Response__TipoEntidadAssignment_4_0 )
                    {
                     before(grammarAccess.getResponseAccess().getTipoEntidadAssignment_4_0()); 
                    // InternalMyDsl.g:1084:3: ( rule__Response__TipoEntidadAssignment_4_0 )
                    // InternalMyDsl.g:1084:4: rule__Response__TipoEntidadAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Response__TipoEntidadAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getResponseAccess().getTipoEntidadAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1088:2: ( ( rule__Response__TipoPrimitivoAssignment_4_1 ) )
                    {
                    // InternalMyDsl.g:1088:2: ( ( rule__Response__TipoPrimitivoAssignment_4_1 ) )
                    // InternalMyDsl.g:1089:3: ( rule__Response__TipoPrimitivoAssignment_4_1 )
                    {
                     before(grammarAccess.getResponseAccess().getTipoPrimitivoAssignment_4_1()); 
                    // InternalMyDsl.g:1090:3: ( rule__Response__TipoPrimitivoAssignment_4_1 )
                    // InternalMyDsl.g:1090:4: rule__Response__TipoPrimitivoAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Response__TipoPrimitivoAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getResponseAccess().getTipoPrimitivoAssignment_4_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Alternatives_4"


    // $ANTLR start "rule__Request__Alternatives_4"
    // InternalMyDsl.g:1098:1: rule__Request__Alternatives_4 : ( ( ( rule__Request__TipoEntidadAssignment_4_0 ) ) | ( ( rule__Request__TipoPrimitivoAssignment_4_1 ) ) );
    public final void rule__Request__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1102:1: ( ( ( rule__Request__TipoEntidadAssignment_4_0 ) ) | ( ( rule__Request__TipoPrimitivoAssignment_4_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( ((LA7_0>=15 && LA7_0<=17)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:1103:2: ( ( rule__Request__TipoEntidadAssignment_4_0 ) )
                    {
                    // InternalMyDsl.g:1103:2: ( ( rule__Request__TipoEntidadAssignment_4_0 ) )
                    // InternalMyDsl.g:1104:3: ( rule__Request__TipoEntidadAssignment_4_0 )
                    {
                     before(grammarAccess.getRequestAccess().getTipoEntidadAssignment_4_0()); 
                    // InternalMyDsl.g:1105:3: ( rule__Request__TipoEntidadAssignment_4_0 )
                    // InternalMyDsl.g:1105:4: rule__Request__TipoEntidadAssignment_4_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Request__TipoEntidadAssignment_4_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRequestAccess().getTipoEntidadAssignment_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1109:2: ( ( rule__Request__TipoPrimitivoAssignment_4_1 ) )
                    {
                    // InternalMyDsl.g:1109:2: ( ( rule__Request__TipoPrimitivoAssignment_4_1 ) )
                    // InternalMyDsl.g:1110:3: ( rule__Request__TipoPrimitivoAssignment_4_1 )
                    {
                     before(grammarAccess.getRequestAccess().getTipoPrimitivoAssignment_4_1()); 
                    // InternalMyDsl.g:1111:3: ( rule__Request__TipoPrimitivoAssignment_4_1 )
                    // InternalMyDsl.g:1111:4: rule__Request__TipoPrimitivoAssignment_4_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Request__TipoPrimitivoAssignment_4_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getRequestAccess().getTipoPrimitivoAssignment_4_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Alternatives_4"


    // $ANTLR start "rule__DatoPrimitivo__Alternatives"
    // InternalMyDsl.g:1119:1: rule__DatoPrimitivo__Alternatives : ( ( ruleMyNumeric ) | ( ruleMyString ) | ( ruleMyBoolean ) );
    public final void rule__DatoPrimitivo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1123:1: ( ( ruleMyNumeric ) | ( ruleMyString ) | ( ruleMyBoolean ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt8=1;
                }
                break;
            case RULE_STRING:
            case RULE_ID:
                {
                alt8=2;
                }
                break;
            case 13:
            case 14:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:1124:2: ( ruleMyNumeric )
                    {
                    // InternalMyDsl.g:1124:2: ( ruleMyNumeric )
                    // InternalMyDsl.g:1125:3: ruleMyNumeric
                    {
                     before(grammarAccess.getDatoPrimitivoAccess().getMyNumericParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMyNumeric();

                    state._fsp--;

                     after(grammarAccess.getDatoPrimitivoAccess().getMyNumericParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1130:2: ( ruleMyString )
                    {
                    // InternalMyDsl.g:1130:2: ( ruleMyString )
                    // InternalMyDsl.g:1131:3: ruleMyString
                    {
                     before(grammarAccess.getDatoPrimitivoAccess().getMyStringParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMyString();

                    state._fsp--;

                     after(grammarAccess.getDatoPrimitivoAccess().getMyStringParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1136:2: ( ruleMyBoolean )
                    {
                    // InternalMyDsl.g:1136:2: ( ruleMyBoolean )
                    // InternalMyDsl.g:1137:3: ruleMyBoolean
                    {
                     before(grammarAccess.getDatoPrimitivoAccess().getMyBooleanParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMyBoolean();

                    state._fsp--;

                     after(grammarAccess.getDatoPrimitivoAccess().getMyBooleanParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__DatoPrimitivo__Alternatives"


    // $ANTLR start "rule__Mapping__Alternatives_6"
    // InternalMyDsl.g:1146:1: rule__Mapping__Alternatives_6 : ( ( ( rule__Mapping__Group_6_0__0 ) ) | ( ( rule__Mapping__DatoprimitivoAssignment_6_1 ) ) );
    public final void rule__Mapping__Alternatives_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1150:1: ( ( ( rule__Mapping__Group_6_0__0 ) ) | ( ( rule__Mapping__DatoprimitivoAssignment_6_1 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==67) ) {
                alt9=1;
            }
            else if ( ((LA9_0>=RULE_INT && LA9_0<=RULE_ID)||(LA9_0>=13 && LA9_0<=14)) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:1151:2: ( ( rule__Mapping__Group_6_0__0 ) )
                    {
                    // InternalMyDsl.g:1151:2: ( ( rule__Mapping__Group_6_0__0 ) )
                    // InternalMyDsl.g:1152:3: ( rule__Mapping__Group_6_0__0 )
                    {
                     before(grammarAccess.getMappingAccess().getGroup_6_0()); 
                    // InternalMyDsl.g:1153:3: ( rule__Mapping__Group_6_0__0 )
                    // InternalMyDsl.g:1153:4: rule__Mapping__Group_6_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mapping__Group_6_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMappingAccess().getGroup_6_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1157:2: ( ( rule__Mapping__DatoprimitivoAssignment_6_1 ) )
                    {
                    // InternalMyDsl.g:1157:2: ( ( rule__Mapping__DatoprimitivoAssignment_6_1 ) )
                    // InternalMyDsl.g:1158:3: ( rule__Mapping__DatoprimitivoAssignment_6_1 )
                    {
                     before(grammarAccess.getMappingAccess().getDatoprimitivoAssignment_6_1()); 
                    // InternalMyDsl.g:1159:3: ( rule__Mapping__DatoprimitivoAssignment_6_1 )
                    // InternalMyDsl.g:1159:4: rule__Mapping__DatoprimitivoAssignment_6_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Mapping__DatoprimitivoAssignment_6_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMappingAccess().getDatoprimitivoAssignment_6_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Alternatives_6"


    // $ANTLR start "rule__Asercion__Alternatives_0"
    // InternalMyDsl.g:1167:1: rule__Asercion__Alternatives_0 : ( ( ( rule__Asercion__Elemento1Assignment_0_0 ) ) | ( ( rule__Asercion__Elemento1Assignment_0_1 ) ) | ( ( rule__Asercion__Group_0_2__0 ) ) );
    public final void rule__Asercion__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1171:1: ( ( ( rule__Asercion__Elemento1Assignment_0_0 ) ) | ( ( rule__Asercion__Elemento1Assignment_0_1 ) ) | ( ( rule__Asercion__Group_0_2__0 ) ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt10=1;
                }
                break;
            case 73:
                {
                alt10=2;
                }
                break;
            case 68:
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:1172:2: ( ( rule__Asercion__Elemento1Assignment_0_0 ) )
                    {
                    // InternalMyDsl.g:1172:2: ( ( rule__Asercion__Elemento1Assignment_0_0 ) )
                    // InternalMyDsl.g:1173:3: ( rule__Asercion__Elemento1Assignment_0_0 )
                    {
                     before(grammarAccess.getAsercionAccess().getElemento1Assignment_0_0()); 
                    // InternalMyDsl.g:1174:3: ( rule__Asercion__Elemento1Assignment_0_0 )
                    // InternalMyDsl.g:1174:4: rule__Asercion__Elemento1Assignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Asercion__Elemento1Assignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAsercionAccess().getElemento1Assignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1178:2: ( ( rule__Asercion__Elemento1Assignment_0_1 ) )
                    {
                    // InternalMyDsl.g:1178:2: ( ( rule__Asercion__Elemento1Assignment_0_1 ) )
                    // InternalMyDsl.g:1179:3: ( rule__Asercion__Elemento1Assignment_0_1 )
                    {
                     before(grammarAccess.getAsercionAccess().getElemento1Assignment_0_1()); 
                    // InternalMyDsl.g:1180:3: ( rule__Asercion__Elemento1Assignment_0_1 )
                    // InternalMyDsl.g:1180:4: rule__Asercion__Elemento1Assignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Asercion__Elemento1Assignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAsercionAccess().getElemento1Assignment_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1184:2: ( ( rule__Asercion__Group_0_2__0 ) )
                    {
                    // InternalMyDsl.g:1184:2: ( ( rule__Asercion__Group_0_2__0 ) )
                    // InternalMyDsl.g:1185:3: ( rule__Asercion__Group_0_2__0 )
                    {
                     before(grammarAccess.getAsercionAccess().getGroup_0_2()); 
                    // InternalMyDsl.g:1186:3: ( rule__Asercion__Group_0_2__0 )
                    // InternalMyDsl.g:1186:4: rule__Asercion__Group_0_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Asercion__Group_0_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAsercionAccess().getGroup_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Alternatives_0"


    // $ANTLR start "rule__Asercion__Alternatives_2"
    // InternalMyDsl.g:1194:1: rule__Asercion__Alternatives_2 : ( ( ( rule__Asercion__Elemento2Assignment_2_0 ) ) | ( ( rule__Asercion__Group_2_1__0 ) ) );
    public final void rule__Asercion__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1198:1: ( ( ( rule__Asercion__Elemento2Assignment_2_0 ) ) | ( ( rule__Asercion__Group_2_1__0 ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=RULE_INT && LA11_0<=RULE_ID)||(LA11_0>=13 && LA11_0<=14)) ) {
                alt11=1;
            }
            else if ( (LA11_0==69) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:1199:2: ( ( rule__Asercion__Elemento2Assignment_2_0 ) )
                    {
                    // InternalMyDsl.g:1199:2: ( ( rule__Asercion__Elemento2Assignment_2_0 ) )
                    // InternalMyDsl.g:1200:3: ( rule__Asercion__Elemento2Assignment_2_0 )
                    {
                     before(grammarAccess.getAsercionAccess().getElemento2Assignment_2_0()); 
                    // InternalMyDsl.g:1201:3: ( rule__Asercion__Elemento2Assignment_2_0 )
                    // InternalMyDsl.g:1201:4: rule__Asercion__Elemento2Assignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Asercion__Elemento2Assignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAsercionAccess().getElemento2Assignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1205:2: ( ( rule__Asercion__Group_2_1__0 ) )
                    {
                    // InternalMyDsl.g:1205:2: ( ( rule__Asercion__Group_2_1__0 ) )
                    // InternalMyDsl.g:1206:3: ( rule__Asercion__Group_2_1__0 )
                    {
                     before(grammarAccess.getAsercionAccess().getGroup_2_1()); 
                    // InternalMyDsl.g:1207:3: ( rule__Asercion__Group_2_1__0 )
                    // InternalMyDsl.g:1207:4: rule__Asercion__Group_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Asercion__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAsercionAccess().getGroup_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Alternatives_2"


    // $ANTLR start "rule__EBoolean__Alternatives"
    // InternalMyDsl.g:1215:1: rule__EBoolean__Alternatives : ( ( 'true' ) | ( 'false' ) );
    public final void rule__EBoolean__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1219:1: ( ( 'true' ) | ( 'false' ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==13) ) {
                alt12=1;
            }
            else if ( (LA12_0==14) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:1220:2: ( 'true' )
                    {
                    // InternalMyDsl.g:1220:2: ( 'true' )
                    // InternalMyDsl.g:1221:3: 'true'
                    {
                     before(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 
                    match(input,13,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getTrueKeyword_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1226:2: ( 'false' )
                    {
                    // InternalMyDsl.g:1226:2: ( 'false' )
                    // InternalMyDsl.g:1227:3: 'false'
                    {
                     before(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 
                    match(input,14,FOLLOW_2); 
                     after(grammarAccess.getEBooleanAccess().getFalseKeyword_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EBoolean__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalMyDsl.g:1236:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1240:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1241:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:1241:2: ( RULE_STRING )
                    // InternalMyDsl.g:1242:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1247:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:1247:2: ( RULE_ID )
                    // InternalMyDsl.g:1248:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__TipoAtributo__Alternatives"
    // InternalMyDsl.g:1257:1: rule__TipoAtributo__Alternatives : ( ( ( 'string' ) ) | ( ( 'int' ) ) | ( ( 'boolean' ) ) );
    public final void rule__TipoAtributo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1261:1: ( ( ( 'string' ) ) | ( ( 'int' ) ) | ( ( 'boolean' ) ) )
            int alt14=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt14=1;
                }
                break;
            case 16:
                {
                alt14=2;
                }
                break;
            case 17:
                {
                alt14=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:1262:2: ( ( 'string' ) )
                    {
                    // InternalMyDsl.g:1262:2: ( ( 'string' ) )
                    // InternalMyDsl.g:1263:3: ( 'string' )
                    {
                     before(grammarAccess.getTipoAtributoAccess().getStringEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:1264:3: ( 'string' )
                    // InternalMyDsl.g:1264:4: 'string'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoAtributoAccess().getStringEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1268:2: ( ( 'int' ) )
                    {
                    // InternalMyDsl.g:1268:2: ( ( 'int' ) )
                    // InternalMyDsl.g:1269:3: ( 'int' )
                    {
                     before(grammarAccess.getTipoAtributoAccess().getIntEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:1270:3: ( 'int' )
                    // InternalMyDsl.g:1270:4: 'int'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoAtributoAccess().getIntEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1274:2: ( ( 'boolean' ) )
                    {
                    // InternalMyDsl.g:1274:2: ( ( 'boolean' ) )
                    // InternalMyDsl.g:1275:3: ( 'boolean' )
                    {
                     before(grammarAccess.getTipoAtributoAccess().getBooleanEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:1276:3: ( 'boolean' )
                    // InternalMyDsl.g:1276:4: 'boolean'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoAtributoAccess().getBooleanEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TipoAtributo__Alternatives"


    // $ANTLR start "rule__Operador__Alternatives"
    // InternalMyDsl.g:1284:1: rule__Operador__Alternatives : ( ( ( '==' ) ) | ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) );
    public final void rule__Operador__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1288:1: ( ( ( '==' ) ) | ( ( '>' ) ) | ( ( '<' ) ) | ( ( '>=' ) ) | ( ( '<=' ) ) )
            int alt15=5;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt15=1;
                }
                break;
            case 19:
                {
                alt15=2;
                }
                break;
            case 20:
                {
                alt15=3;
                }
                break;
            case 21:
                {
                alt15=4;
                }
                break;
            case 22:
                {
                alt15=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // InternalMyDsl.g:1289:2: ( ( '==' ) )
                    {
                    // InternalMyDsl.g:1289:2: ( ( '==' ) )
                    // InternalMyDsl.g:1290:3: ( '==' )
                    {
                     before(grammarAccess.getOperadorAccess().getIgualEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:1291:3: ( '==' )
                    // InternalMyDsl.g:1291:4: '=='
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorAccess().getIgualEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1295:2: ( ( '>' ) )
                    {
                    // InternalMyDsl.g:1295:2: ( ( '>' ) )
                    // InternalMyDsl.g:1296:3: ( '>' )
                    {
                     before(grammarAccess.getOperadorAccess().getMayorEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:1297:3: ( '>' )
                    // InternalMyDsl.g:1297:4: '>'
                    {
                    match(input,19,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorAccess().getMayorEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1301:2: ( ( '<' ) )
                    {
                    // InternalMyDsl.g:1301:2: ( ( '<' ) )
                    // InternalMyDsl.g:1302:3: ( '<' )
                    {
                     before(grammarAccess.getOperadorAccess().getMenorEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:1303:3: ( '<' )
                    // InternalMyDsl.g:1303:4: '<'
                    {
                    match(input,20,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorAccess().getMenorEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1307:2: ( ( '>=' ) )
                    {
                    // InternalMyDsl.g:1307:2: ( ( '>=' ) )
                    // InternalMyDsl.g:1308:3: ( '>=' )
                    {
                     before(grammarAccess.getOperadorAccess().getMayorIgualEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:1309:3: ( '>=' )
                    // InternalMyDsl.g:1309:4: '>='
                    {
                    match(input,21,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorAccess().getMayorIgualEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1313:2: ( ( '<=' ) )
                    {
                    // InternalMyDsl.g:1313:2: ( ( '<=' ) )
                    // InternalMyDsl.g:1314:3: ( '<=' )
                    {
                     before(grammarAccess.getOperadorAccess().getMenorIgualEnumLiteralDeclaration_4()); 
                    // InternalMyDsl.g:1315:3: ( '<=' )
                    // InternalMyDsl.g:1315:4: '<='
                    {
                    match(input,22,FOLLOW_2); 

                    }

                     after(grammarAccess.getOperadorAccess().getMenorIgualEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Operador__Alternatives"


    // $ANTLR start "rule__Mockaroo__Alternatives"
    // InternalMyDsl.g:1323:1: rule__Mockaroo__Alternatives : ( ( ( 'FirstNameType' ) ) | ( ( 'LastNameType' ) ) | ( ( 'FamilyNameType' ) ) | ( ( 'FullNameType' ) ) | ( ( 'GenderType' ) ) | ( ( 'EmailAddressType' ) ) | ( ( 'PhoneType' ) ) | ( ( 'CountryType' ) ) | ( ( 'CityType' ) ) | ( ( 'CountryCodeType' ) ) | ( ( 'LatitudeType' ) ) | ( ( 'LongitudeType' ) ) | ( ( 'RowNumberType' ) ) | ( ( 'BooleanType' ) ) );
    public final void rule__Mockaroo__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1327:1: ( ( ( 'FirstNameType' ) ) | ( ( 'LastNameType' ) ) | ( ( 'FamilyNameType' ) ) | ( ( 'FullNameType' ) ) | ( ( 'GenderType' ) ) | ( ( 'EmailAddressType' ) ) | ( ( 'PhoneType' ) ) | ( ( 'CountryType' ) ) | ( ( 'CityType' ) ) | ( ( 'CountryCodeType' ) ) | ( ( 'LatitudeType' ) ) | ( ( 'LongitudeType' ) ) | ( ( 'RowNumberType' ) ) | ( ( 'BooleanType' ) ) )
            int alt16=14;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt16=1;
                }
                break;
            case 24:
                {
                alt16=2;
                }
                break;
            case 25:
                {
                alt16=3;
                }
                break;
            case 26:
                {
                alt16=4;
                }
                break;
            case 27:
                {
                alt16=5;
                }
                break;
            case 28:
                {
                alt16=6;
                }
                break;
            case 29:
                {
                alt16=7;
                }
                break;
            case 30:
                {
                alt16=8;
                }
                break;
            case 31:
                {
                alt16=9;
                }
                break;
            case 32:
                {
                alt16=10;
                }
                break;
            case 33:
                {
                alt16=11;
                }
                break;
            case 34:
                {
                alt16=12;
                }
                break;
            case 35:
                {
                alt16=13;
                }
                break;
            case 36:
                {
                alt16=14;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalMyDsl.g:1328:2: ( ( 'FirstNameType' ) )
                    {
                    // InternalMyDsl.g:1328:2: ( ( 'FirstNameType' ) )
                    // InternalMyDsl.g:1329:3: ( 'FirstNameType' )
                    {
                     before(grammarAccess.getMockarooAccess().getFirstNameTypeEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:1330:3: ( 'FirstNameType' )
                    // InternalMyDsl.g:1330:4: 'FirstNameType'
                    {
                    match(input,23,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getFirstNameTypeEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1334:2: ( ( 'LastNameType' ) )
                    {
                    // InternalMyDsl.g:1334:2: ( ( 'LastNameType' ) )
                    // InternalMyDsl.g:1335:3: ( 'LastNameType' )
                    {
                     before(grammarAccess.getMockarooAccess().getLastNameTypeEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:1336:3: ( 'LastNameType' )
                    // InternalMyDsl.g:1336:4: 'LastNameType'
                    {
                    match(input,24,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getLastNameTypeEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1340:2: ( ( 'FamilyNameType' ) )
                    {
                    // InternalMyDsl.g:1340:2: ( ( 'FamilyNameType' ) )
                    // InternalMyDsl.g:1341:3: ( 'FamilyNameType' )
                    {
                     before(grammarAccess.getMockarooAccess().getFamilyNameTypeEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:1342:3: ( 'FamilyNameType' )
                    // InternalMyDsl.g:1342:4: 'FamilyNameType'
                    {
                    match(input,25,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getFamilyNameTypeEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1346:2: ( ( 'FullNameType' ) )
                    {
                    // InternalMyDsl.g:1346:2: ( ( 'FullNameType' ) )
                    // InternalMyDsl.g:1347:3: ( 'FullNameType' )
                    {
                     before(grammarAccess.getMockarooAccess().getFullNameTypeEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:1348:3: ( 'FullNameType' )
                    // InternalMyDsl.g:1348:4: 'FullNameType'
                    {
                    match(input,26,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getFullNameTypeEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:1352:2: ( ( 'GenderType' ) )
                    {
                    // InternalMyDsl.g:1352:2: ( ( 'GenderType' ) )
                    // InternalMyDsl.g:1353:3: ( 'GenderType' )
                    {
                     before(grammarAccess.getMockarooAccess().getGenderTypeEnumLiteralDeclaration_4()); 
                    // InternalMyDsl.g:1354:3: ( 'GenderType' )
                    // InternalMyDsl.g:1354:4: 'GenderType'
                    {
                    match(input,27,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getGenderTypeEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:1358:2: ( ( 'EmailAddressType' ) )
                    {
                    // InternalMyDsl.g:1358:2: ( ( 'EmailAddressType' ) )
                    // InternalMyDsl.g:1359:3: ( 'EmailAddressType' )
                    {
                     before(grammarAccess.getMockarooAccess().getEmailAddressTypeEnumLiteralDeclaration_5()); 
                    // InternalMyDsl.g:1360:3: ( 'EmailAddressType' )
                    // InternalMyDsl.g:1360:4: 'EmailAddressType'
                    {
                    match(input,28,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getEmailAddressTypeEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:1364:2: ( ( 'PhoneType' ) )
                    {
                    // InternalMyDsl.g:1364:2: ( ( 'PhoneType' ) )
                    // InternalMyDsl.g:1365:3: ( 'PhoneType' )
                    {
                     before(grammarAccess.getMockarooAccess().getPhoneTypeEnumLiteralDeclaration_6()); 
                    // InternalMyDsl.g:1366:3: ( 'PhoneType' )
                    // InternalMyDsl.g:1366:4: 'PhoneType'
                    {
                    match(input,29,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getPhoneTypeEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:1370:2: ( ( 'CountryType' ) )
                    {
                    // InternalMyDsl.g:1370:2: ( ( 'CountryType' ) )
                    // InternalMyDsl.g:1371:3: ( 'CountryType' )
                    {
                     before(grammarAccess.getMockarooAccess().getCountryTypeEnumLiteralDeclaration_7()); 
                    // InternalMyDsl.g:1372:3: ( 'CountryType' )
                    // InternalMyDsl.g:1372:4: 'CountryType'
                    {
                    match(input,30,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getCountryTypeEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:1376:2: ( ( 'CityType' ) )
                    {
                    // InternalMyDsl.g:1376:2: ( ( 'CityType' ) )
                    // InternalMyDsl.g:1377:3: ( 'CityType' )
                    {
                     before(grammarAccess.getMockarooAccess().getCityTypeEnumLiteralDeclaration_8()); 
                    // InternalMyDsl.g:1378:3: ( 'CityType' )
                    // InternalMyDsl.g:1378:4: 'CityType'
                    {
                    match(input,31,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getCityTypeEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:1382:2: ( ( 'CountryCodeType' ) )
                    {
                    // InternalMyDsl.g:1382:2: ( ( 'CountryCodeType' ) )
                    // InternalMyDsl.g:1383:3: ( 'CountryCodeType' )
                    {
                     before(grammarAccess.getMockarooAccess().getCountryCodeTypeEnumLiteralDeclaration_9()); 
                    // InternalMyDsl.g:1384:3: ( 'CountryCodeType' )
                    // InternalMyDsl.g:1384:4: 'CountryCodeType'
                    {
                    match(input,32,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getCountryCodeTypeEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:1388:2: ( ( 'LatitudeType' ) )
                    {
                    // InternalMyDsl.g:1388:2: ( ( 'LatitudeType' ) )
                    // InternalMyDsl.g:1389:3: ( 'LatitudeType' )
                    {
                     before(grammarAccess.getMockarooAccess().getLatitudeTypeEnumLiteralDeclaration_10()); 
                    // InternalMyDsl.g:1390:3: ( 'LatitudeType' )
                    // InternalMyDsl.g:1390:4: 'LatitudeType'
                    {
                    match(input,33,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getLatitudeTypeEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalMyDsl.g:1394:2: ( ( 'LongitudeType' ) )
                    {
                    // InternalMyDsl.g:1394:2: ( ( 'LongitudeType' ) )
                    // InternalMyDsl.g:1395:3: ( 'LongitudeType' )
                    {
                     before(grammarAccess.getMockarooAccess().getLongitudeTypeEnumLiteralDeclaration_11()); 
                    // InternalMyDsl.g:1396:3: ( 'LongitudeType' )
                    // InternalMyDsl.g:1396:4: 'LongitudeType'
                    {
                    match(input,34,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getLongitudeTypeEnumLiteralDeclaration_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalMyDsl.g:1400:2: ( ( 'RowNumberType' ) )
                    {
                    // InternalMyDsl.g:1400:2: ( ( 'RowNumberType' ) )
                    // InternalMyDsl.g:1401:3: ( 'RowNumberType' )
                    {
                     before(grammarAccess.getMockarooAccess().getRowNumberTypeEnumLiteralDeclaration_12()); 
                    // InternalMyDsl.g:1402:3: ( 'RowNumberType' )
                    // InternalMyDsl.g:1402:4: 'RowNumberType'
                    {
                    match(input,35,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getRowNumberTypeEnumLiteralDeclaration_12()); 

                    }


                    }
                    break;
                case 14 :
                    // InternalMyDsl.g:1406:2: ( ( 'BooleanType' ) )
                    {
                    // InternalMyDsl.g:1406:2: ( ( 'BooleanType' ) )
                    // InternalMyDsl.g:1407:3: ( 'BooleanType' )
                    {
                     before(grammarAccess.getMockarooAccess().getBooleanTypeEnumLiteralDeclaration_13()); 
                    // InternalMyDsl.g:1408:3: ( 'BooleanType' )
                    // InternalMyDsl.g:1408:4: 'BooleanType'
                    {
                    match(input,36,FOLLOW_2); 

                    }

                     after(grammarAccess.getMockarooAccess().getBooleanTypeEnumLiteralDeclaration_13()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mockaroo__Alternatives"


    // $ANTLR start "rule__TipoMetodoRest__Alternatives"
    // InternalMyDsl.g:1416:1: rule__TipoMetodoRest__Alternatives : ( ( ( 'GET' ) ) | ( ( 'POST' ) ) | ( ( 'PUT' ) ) | ( ( 'DELETE' ) ) );
    public final void rule__TipoMetodoRest__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1420:1: ( ( ( 'GET' ) ) | ( ( 'POST' ) ) | ( ( 'PUT' ) ) | ( ( 'DELETE' ) ) )
            int alt17=4;
            switch ( input.LA(1) ) {
            case 37:
                {
                alt17=1;
                }
                break;
            case 38:
                {
                alt17=2;
                }
                break;
            case 39:
                {
                alt17=3;
                }
                break;
            case 40:
                {
                alt17=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalMyDsl.g:1421:2: ( ( 'GET' ) )
                    {
                    // InternalMyDsl.g:1421:2: ( ( 'GET' ) )
                    // InternalMyDsl.g:1422:3: ( 'GET' )
                    {
                     before(grammarAccess.getTipoMetodoRestAccess().getGETEnumLiteralDeclaration_0()); 
                    // InternalMyDsl.g:1423:3: ( 'GET' )
                    // InternalMyDsl.g:1423:4: 'GET'
                    {
                    match(input,37,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoMetodoRestAccess().getGETEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1427:2: ( ( 'POST' ) )
                    {
                    // InternalMyDsl.g:1427:2: ( ( 'POST' ) )
                    // InternalMyDsl.g:1428:3: ( 'POST' )
                    {
                     before(grammarAccess.getTipoMetodoRestAccess().getPOSTEnumLiteralDeclaration_1()); 
                    // InternalMyDsl.g:1429:3: ( 'POST' )
                    // InternalMyDsl.g:1429:4: 'POST'
                    {
                    match(input,38,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoMetodoRestAccess().getPOSTEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1433:2: ( ( 'PUT' ) )
                    {
                    // InternalMyDsl.g:1433:2: ( ( 'PUT' ) )
                    // InternalMyDsl.g:1434:3: ( 'PUT' )
                    {
                     before(grammarAccess.getTipoMetodoRestAccess().getPUTEnumLiteralDeclaration_2()); 
                    // InternalMyDsl.g:1435:3: ( 'PUT' )
                    // InternalMyDsl.g:1435:4: 'PUT'
                    {
                    match(input,39,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoMetodoRestAccess().getPUTEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1439:2: ( ( 'DELETE' ) )
                    {
                    // InternalMyDsl.g:1439:2: ( ( 'DELETE' ) )
                    // InternalMyDsl.g:1440:3: ( 'DELETE' )
                    {
                     before(grammarAccess.getTipoMetodoRestAccess().getDELETEEnumLiteralDeclaration_3()); 
                    // InternalMyDsl.g:1441:3: ( 'DELETE' )
                    // InternalMyDsl.g:1441:4: 'DELETE'
                    {
                    match(input,40,FOLLOW_2); 

                    }

                     after(grammarAccess.getTipoMetodoRestAccess().getDELETEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TipoMetodoRest__Alternatives"


    // $ANTLR start "rule__Api__Group__0"
    // InternalMyDsl.g:1449:1: rule__Api__Group__0 : rule__Api__Group__0__Impl rule__Api__Group__1 ;
    public final void rule__Api__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1453:1: ( rule__Api__Group__0__Impl rule__Api__Group__1 )
            // InternalMyDsl.g:1454:2: rule__Api__Group__0__Impl rule__Api__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Api__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Api__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__0"


    // $ANTLR start "rule__Api__Group__0__Impl"
    // InternalMyDsl.g:1461:1: rule__Api__Group__0__Impl : ( () ) ;
    public final void rule__Api__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1465:1: ( ( () ) )
            // InternalMyDsl.g:1466:1: ( () )
            {
            // InternalMyDsl.g:1466:1: ( () )
            // InternalMyDsl.g:1467:2: ()
            {
             before(grammarAccess.getApiAccess().getApiAction_0()); 
            // InternalMyDsl.g:1468:2: ()
            // InternalMyDsl.g:1468:3: 
            {
            }

             after(grammarAccess.getApiAccess().getApiAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__0__Impl"


    // $ANTLR start "rule__Api__Group__1"
    // InternalMyDsl.g:1476:1: rule__Api__Group__1 : rule__Api__Group__1__Impl rule__Api__Group__2 ;
    public final void rule__Api__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1480:1: ( rule__Api__Group__1__Impl rule__Api__Group__2 )
            // InternalMyDsl.g:1481:2: rule__Api__Group__1__Impl rule__Api__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Api__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Api__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__1"


    // $ANTLR start "rule__Api__Group__1__Impl"
    // InternalMyDsl.g:1488:1: rule__Api__Group__1__Impl : ( 'apiURL' ) ;
    public final void rule__Api__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1492:1: ( ( 'apiURL' ) )
            // InternalMyDsl.g:1493:1: ( 'apiURL' )
            {
            // InternalMyDsl.g:1493:1: ( 'apiURL' )
            // InternalMyDsl.g:1494:2: 'apiURL'
            {
             before(grammarAccess.getApiAccess().getApiURLKeyword_1()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getApiAccess().getApiURLKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__1__Impl"


    // $ANTLR start "rule__Api__Group__2"
    // InternalMyDsl.g:1503:1: rule__Api__Group__2 : rule__Api__Group__2__Impl rule__Api__Group__3 ;
    public final void rule__Api__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1507:1: ( rule__Api__Group__2__Impl rule__Api__Group__3 )
            // InternalMyDsl.g:1508:2: rule__Api__Group__2__Impl rule__Api__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Api__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Api__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__2"


    // $ANTLR start "rule__Api__Group__2__Impl"
    // InternalMyDsl.g:1515:1: rule__Api__Group__2__Impl : ( RULE_EQUAL ) ;
    public final void rule__Api__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1519:1: ( ( RULE_EQUAL ) )
            // InternalMyDsl.g:1520:1: ( RULE_EQUAL )
            {
            // InternalMyDsl.g:1520:1: ( RULE_EQUAL )
            // InternalMyDsl.g:1521:2: RULE_EQUAL
            {
             before(grammarAccess.getApiAccess().getEQUALTerminalRuleCall_2()); 
            match(input,RULE_EQUAL,FOLLOW_2); 
             after(grammarAccess.getApiAccess().getEQUALTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__2__Impl"


    // $ANTLR start "rule__Api__Group__3"
    // InternalMyDsl.g:1530:1: rule__Api__Group__3 : rule__Api__Group__3__Impl rule__Api__Group__4 ;
    public final void rule__Api__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1534:1: ( rule__Api__Group__3__Impl rule__Api__Group__4 )
            // InternalMyDsl.g:1535:2: rule__Api__Group__3__Impl rule__Api__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Api__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Api__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__3"


    // $ANTLR start "rule__Api__Group__3__Impl"
    // InternalMyDsl.g:1542:1: rule__Api__Group__3__Impl : ( ( rule__Api__UrlAssignment_3 ) ) ;
    public final void rule__Api__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1546:1: ( ( ( rule__Api__UrlAssignment_3 ) ) )
            // InternalMyDsl.g:1547:1: ( ( rule__Api__UrlAssignment_3 ) )
            {
            // InternalMyDsl.g:1547:1: ( ( rule__Api__UrlAssignment_3 ) )
            // InternalMyDsl.g:1548:2: ( rule__Api__UrlAssignment_3 )
            {
             before(grammarAccess.getApiAccess().getUrlAssignment_3()); 
            // InternalMyDsl.g:1549:2: ( rule__Api__UrlAssignment_3 )
            // InternalMyDsl.g:1549:3: rule__Api__UrlAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Api__UrlAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getApiAccess().getUrlAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__3__Impl"


    // $ANTLR start "rule__Api__Group__4"
    // InternalMyDsl.g:1557:1: rule__Api__Group__4 : rule__Api__Group__4__Impl rule__Api__Group__5 ;
    public final void rule__Api__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1561:1: ( rule__Api__Group__4__Impl rule__Api__Group__5 )
            // InternalMyDsl.g:1562:2: rule__Api__Group__4__Impl rule__Api__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Api__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Api__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__4"


    // $ANTLR start "rule__Api__Group__4__Impl"
    // InternalMyDsl.g:1569:1: rule__Api__Group__4__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Api__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1573:1: ( ( RULE_SEMICOLON ) )
            // InternalMyDsl.g:1574:1: ( RULE_SEMICOLON )
            {
            // InternalMyDsl.g:1574:1: ( RULE_SEMICOLON )
            // InternalMyDsl.g:1575:2: RULE_SEMICOLON
            {
             before(grammarAccess.getApiAccess().getSEMICOLONTerminalRuleCall_4()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getApiAccess().getSEMICOLONTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__4__Impl"


    // $ANTLR start "rule__Api__Group__5"
    // InternalMyDsl.g:1584:1: rule__Api__Group__5 : rule__Api__Group__5__Impl rule__Api__Group__6 ;
    public final void rule__Api__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1588:1: ( rule__Api__Group__5__Impl rule__Api__Group__6 )
            // InternalMyDsl.g:1589:2: rule__Api__Group__5__Impl rule__Api__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__Api__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Api__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__5"


    // $ANTLR start "rule__Api__Group__5__Impl"
    // InternalMyDsl.g:1596:1: rule__Api__Group__5__Impl : ( ( rule__Api__EntidadesAssignment_5 )* ) ;
    public final void rule__Api__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1600:1: ( ( ( rule__Api__EntidadesAssignment_5 )* ) )
            // InternalMyDsl.g:1601:1: ( ( rule__Api__EntidadesAssignment_5 )* )
            {
            // InternalMyDsl.g:1601:1: ( ( rule__Api__EntidadesAssignment_5 )* )
            // InternalMyDsl.g:1602:2: ( rule__Api__EntidadesAssignment_5 )*
            {
             before(grammarAccess.getApiAccess().getEntidadesAssignment_5()); 
            // InternalMyDsl.g:1603:2: ( rule__Api__EntidadesAssignment_5 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==42||LA18_0==50) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMyDsl.g:1603:3: rule__Api__EntidadesAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Api__EntidadesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

             after(grammarAccess.getApiAccess().getEntidadesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__5__Impl"


    // $ANTLR start "rule__Api__Group__6"
    // InternalMyDsl.g:1611:1: rule__Api__Group__6 : rule__Api__Group__6__Impl rule__Api__Group__7 ;
    public final void rule__Api__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1615:1: ( rule__Api__Group__6__Impl rule__Api__Group__7 )
            // InternalMyDsl.g:1616:2: rule__Api__Group__6__Impl rule__Api__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__Api__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Api__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__6"


    // $ANTLR start "rule__Api__Group__6__Impl"
    // InternalMyDsl.g:1623:1: rule__Api__Group__6__Impl : ( ( rule__Api__PrimitivetypesAssignment_6 )* ) ;
    public final void rule__Api__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1627:1: ( ( ( rule__Api__PrimitivetypesAssignment_6 )* ) )
            // InternalMyDsl.g:1628:1: ( ( rule__Api__PrimitivetypesAssignment_6 )* )
            {
            // InternalMyDsl.g:1628:1: ( ( rule__Api__PrimitivetypesAssignment_6 )* )
            // InternalMyDsl.g:1629:2: ( rule__Api__PrimitivetypesAssignment_6 )*
            {
             before(grammarAccess.getApiAccess().getPrimitivetypesAssignment_6()); 
            // InternalMyDsl.g:1630:2: ( rule__Api__PrimitivetypesAssignment_6 )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=15 && LA19_0<=17)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMyDsl.g:1630:3: rule__Api__PrimitivetypesAssignment_6
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Api__PrimitivetypesAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

             after(grammarAccess.getApiAccess().getPrimitivetypesAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__6__Impl"


    // $ANTLR start "rule__Api__Group__7"
    // InternalMyDsl.g:1638:1: rule__Api__Group__7 : rule__Api__Group__7__Impl rule__Api__Group__8 ;
    public final void rule__Api__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1642:1: ( rule__Api__Group__7__Impl rule__Api__Group__8 )
            // InternalMyDsl.g:1643:2: rule__Api__Group__7__Impl rule__Api__Group__8
            {
            pushFollow(FOLLOW_7);
            rule__Api__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Api__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__7"


    // $ANTLR start "rule__Api__Group__7__Impl"
    // InternalMyDsl.g:1650:1: rule__Api__Group__7__Impl : ( ( rule__Api__ServiciosRestAssignment_7 )* ) ;
    public final void rule__Api__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1654:1: ( ( ( rule__Api__ServiciosRestAssignment_7 )* ) )
            // InternalMyDsl.g:1655:1: ( ( rule__Api__ServiciosRestAssignment_7 )* )
            {
            // InternalMyDsl.g:1655:1: ( ( rule__Api__ServiciosRestAssignment_7 )* )
            // InternalMyDsl.g:1656:2: ( rule__Api__ServiciosRestAssignment_7 )*
            {
             before(grammarAccess.getApiAccess().getServiciosRestAssignment_7()); 
            // InternalMyDsl.g:1657:2: ( rule__Api__ServiciosRestAssignment_7 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=37 && LA20_0<=40)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMyDsl.g:1657:3: rule__Api__ServiciosRestAssignment_7
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__Api__ServiciosRestAssignment_7();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getApiAccess().getServiciosRestAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__7__Impl"


    // $ANTLR start "rule__Api__Group__8"
    // InternalMyDsl.g:1665:1: rule__Api__Group__8 : rule__Api__Group__8__Impl ;
    public final void rule__Api__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1669:1: ( rule__Api__Group__8__Impl )
            // InternalMyDsl.g:1670:2: rule__Api__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Api__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__8"


    // $ANTLR start "rule__Api__Group__8__Impl"
    // InternalMyDsl.g:1676:1: rule__Api__Group__8__Impl : ( ( rule__Api__TestsAssignment_8 )* ) ;
    public final void rule__Api__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1680:1: ( ( ( rule__Api__TestsAssignment_8 )* ) )
            // InternalMyDsl.g:1681:1: ( ( rule__Api__TestsAssignment_8 )* )
            {
            // InternalMyDsl.g:1681:1: ( ( rule__Api__TestsAssignment_8 )* )
            // InternalMyDsl.g:1682:2: ( rule__Api__TestsAssignment_8 )*
            {
             before(grammarAccess.getApiAccess().getTestsAssignment_8()); 
            // InternalMyDsl.g:1683:2: ( rule__Api__TestsAssignment_8 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==59) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMyDsl.g:1683:3: rule__Api__TestsAssignment_8
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__Api__TestsAssignment_8();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getApiAccess().getTestsAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__Group__8__Impl"


    // $ANTLR start "rule__SimpleEntity__Group__0"
    // InternalMyDsl.g:1692:1: rule__SimpleEntity__Group__0 : rule__SimpleEntity__Group__0__Impl rule__SimpleEntity__Group__1 ;
    public final void rule__SimpleEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1696:1: ( rule__SimpleEntity__Group__0__Impl rule__SimpleEntity__Group__1 )
            // InternalMyDsl.g:1697:2: rule__SimpleEntity__Group__0__Impl rule__SimpleEntity__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__SimpleEntity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleEntity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group__0"


    // $ANTLR start "rule__SimpleEntity__Group__0__Impl"
    // InternalMyDsl.g:1704:1: rule__SimpleEntity__Group__0__Impl : ( 'SimpleEntity' ) ;
    public final void rule__SimpleEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1708:1: ( ( 'SimpleEntity' ) )
            // InternalMyDsl.g:1709:1: ( 'SimpleEntity' )
            {
            // InternalMyDsl.g:1709:1: ( 'SimpleEntity' )
            // InternalMyDsl.g:1710:2: 'SimpleEntity'
            {
             before(grammarAccess.getSimpleEntityAccess().getSimpleEntityKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getSimpleEntityAccess().getSimpleEntityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group__0__Impl"


    // $ANTLR start "rule__SimpleEntity__Group__1"
    // InternalMyDsl.g:1719:1: rule__SimpleEntity__Group__1 : rule__SimpleEntity__Group__1__Impl rule__SimpleEntity__Group__2 ;
    public final void rule__SimpleEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1723:1: ( rule__SimpleEntity__Group__1__Impl rule__SimpleEntity__Group__2 )
            // InternalMyDsl.g:1724:2: rule__SimpleEntity__Group__1__Impl rule__SimpleEntity__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__SimpleEntity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleEntity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group__1"


    // $ANTLR start "rule__SimpleEntity__Group__1__Impl"
    // InternalMyDsl.g:1731:1: rule__SimpleEntity__Group__1__Impl : ( ( rule__SimpleEntity__NameAssignment_1 ) ) ;
    public final void rule__SimpleEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1735:1: ( ( ( rule__SimpleEntity__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1736:1: ( ( rule__SimpleEntity__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1736:1: ( ( rule__SimpleEntity__NameAssignment_1 ) )
            // InternalMyDsl.g:1737:2: ( rule__SimpleEntity__NameAssignment_1 )
            {
             before(grammarAccess.getSimpleEntityAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1738:2: ( rule__SimpleEntity__NameAssignment_1 )
            // InternalMyDsl.g:1738:3: rule__SimpleEntity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__SimpleEntity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSimpleEntityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group__1__Impl"


    // $ANTLR start "rule__SimpleEntity__Group__2"
    // InternalMyDsl.g:1746:1: rule__SimpleEntity__Group__2 : rule__SimpleEntity__Group__2__Impl rule__SimpleEntity__Group__3 ;
    public final void rule__SimpleEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1750:1: ( rule__SimpleEntity__Group__2__Impl rule__SimpleEntity__Group__3 )
            // InternalMyDsl.g:1751:2: rule__SimpleEntity__Group__2__Impl rule__SimpleEntity__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__SimpleEntity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleEntity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group__2"


    // $ANTLR start "rule__SimpleEntity__Group__2__Impl"
    // InternalMyDsl.g:1758:1: rule__SimpleEntity__Group__2__Impl : ( '{' ) ;
    public final void rule__SimpleEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1762:1: ( ( '{' ) )
            // InternalMyDsl.g:1763:1: ( '{' )
            {
            // InternalMyDsl.g:1763:1: ( '{' )
            // InternalMyDsl.g:1764:2: '{'
            {
             before(grammarAccess.getSimpleEntityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getSimpleEntityAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group__2__Impl"


    // $ANTLR start "rule__SimpleEntity__Group__3"
    // InternalMyDsl.g:1773:1: rule__SimpleEntity__Group__3 : rule__SimpleEntity__Group__3__Impl rule__SimpleEntity__Group__4 ;
    public final void rule__SimpleEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1777:1: ( rule__SimpleEntity__Group__3__Impl rule__SimpleEntity__Group__4 )
            // InternalMyDsl.g:1778:2: rule__SimpleEntity__Group__3__Impl rule__SimpleEntity__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__SimpleEntity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SimpleEntity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group__3"


    // $ANTLR start "rule__SimpleEntity__Group__3__Impl"
    // InternalMyDsl.g:1785:1: rule__SimpleEntity__Group__3__Impl : ( ( rule__SimpleEntity__AtributosAssignment_3 )* ) ;
    public final void rule__SimpleEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1789:1: ( ( ( rule__SimpleEntity__AtributosAssignment_3 )* ) )
            // InternalMyDsl.g:1790:1: ( ( rule__SimpleEntity__AtributosAssignment_3 )* )
            {
            // InternalMyDsl.g:1790:1: ( ( rule__SimpleEntity__AtributosAssignment_3 )* )
            // InternalMyDsl.g:1791:2: ( rule__SimpleEntity__AtributosAssignment_3 )*
            {
             before(grammarAccess.getSimpleEntityAccess().getAtributosAssignment_3()); 
            // InternalMyDsl.g:1792:2: ( rule__SimpleEntity__AtributosAssignment_3 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=15 && LA22_0<=17)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalMyDsl.g:1792:3: rule__SimpleEntity__AtributosAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__SimpleEntity__AtributosAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getSimpleEntityAccess().getAtributosAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group__3__Impl"


    // $ANTLR start "rule__SimpleEntity__Group__4"
    // InternalMyDsl.g:1800:1: rule__SimpleEntity__Group__4 : rule__SimpleEntity__Group__4__Impl ;
    public final void rule__SimpleEntity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1804:1: ( rule__SimpleEntity__Group__4__Impl )
            // InternalMyDsl.g:1805:2: rule__SimpleEntity__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SimpleEntity__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group__4"


    // $ANTLR start "rule__SimpleEntity__Group__4__Impl"
    // InternalMyDsl.g:1811:1: rule__SimpleEntity__Group__4__Impl : ( '}' ) ;
    public final void rule__SimpleEntity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1815:1: ( ( '}' ) )
            // InternalMyDsl.g:1816:1: ( '}' )
            {
            // InternalMyDsl.g:1816:1: ( '}' )
            // InternalMyDsl.g:1817:2: '}'
            {
             before(grammarAccess.getSimpleEntityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getSimpleEntityAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__Group__4__Impl"


    // $ANTLR start "rule__AtributoMocka__Group__0"
    // InternalMyDsl.g:1827:1: rule__AtributoMocka__Group__0 : rule__AtributoMocka__Group__0__Impl rule__AtributoMocka__Group__1 ;
    public final void rule__AtributoMocka__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1831:1: ( rule__AtributoMocka__Group__0__Impl rule__AtributoMocka__Group__1 )
            // InternalMyDsl.g:1832:2: rule__AtributoMocka__Group__0__Impl rule__AtributoMocka__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__AtributoMocka__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtributoMocka__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group__0"


    // $ANTLR start "rule__AtributoMocka__Group__0__Impl"
    // InternalMyDsl.g:1839:1: rule__AtributoMocka__Group__0__Impl : ( ( rule__AtributoMocka__TipoAssignment_0 ) ) ;
    public final void rule__AtributoMocka__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1843:1: ( ( ( rule__AtributoMocka__TipoAssignment_0 ) ) )
            // InternalMyDsl.g:1844:1: ( ( rule__AtributoMocka__TipoAssignment_0 ) )
            {
            // InternalMyDsl.g:1844:1: ( ( rule__AtributoMocka__TipoAssignment_0 ) )
            // InternalMyDsl.g:1845:2: ( rule__AtributoMocka__TipoAssignment_0 )
            {
             before(grammarAccess.getAtributoMockaAccess().getTipoAssignment_0()); 
            // InternalMyDsl.g:1846:2: ( rule__AtributoMocka__TipoAssignment_0 )
            // InternalMyDsl.g:1846:3: rule__AtributoMocka__TipoAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AtributoMocka__TipoAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAtributoMockaAccess().getTipoAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group__0__Impl"


    // $ANTLR start "rule__AtributoMocka__Group__1"
    // InternalMyDsl.g:1854:1: rule__AtributoMocka__Group__1 : rule__AtributoMocka__Group__1__Impl rule__AtributoMocka__Group__2 ;
    public final void rule__AtributoMocka__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1858:1: ( rule__AtributoMocka__Group__1__Impl rule__AtributoMocka__Group__2 )
            // InternalMyDsl.g:1859:2: rule__AtributoMocka__Group__1__Impl rule__AtributoMocka__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__AtributoMocka__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtributoMocka__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group__1"


    // $ANTLR start "rule__AtributoMocka__Group__1__Impl"
    // InternalMyDsl.g:1866:1: rule__AtributoMocka__Group__1__Impl : ( ( rule__AtributoMocka__NameAssignment_1 ) ) ;
    public final void rule__AtributoMocka__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1870:1: ( ( ( rule__AtributoMocka__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1871:1: ( ( rule__AtributoMocka__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1871:1: ( ( rule__AtributoMocka__NameAssignment_1 ) )
            // InternalMyDsl.g:1872:2: ( rule__AtributoMocka__NameAssignment_1 )
            {
             before(grammarAccess.getAtributoMockaAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1873:2: ( rule__AtributoMocka__NameAssignment_1 )
            // InternalMyDsl.g:1873:3: rule__AtributoMocka__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AtributoMocka__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAtributoMockaAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group__1__Impl"


    // $ANTLR start "rule__AtributoMocka__Group__2"
    // InternalMyDsl.g:1881:1: rule__AtributoMocka__Group__2 : rule__AtributoMocka__Group__2__Impl rule__AtributoMocka__Group__3 ;
    public final void rule__AtributoMocka__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1885:1: ( rule__AtributoMocka__Group__2__Impl rule__AtributoMocka__Group__3 )
            // InternalMyDsl.g:1886:2: rule__AtributoMocka__Group__2__Impl rule__AtributoMocka__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__AtributoMocka__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtributoMocka__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group__2"


    // $ANTLR start "rule__AtributoMocka__Group__2__Impl"
    // InternalMyDsl.g:1893:1: rule__AtributoMocka__Group__2__Impl : ( ( rule__AtributoMocka__Group_2__0 ) ) ;
    public final void rule__AtributoMocka__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1897:1: ( ( ( rule__AtributoMocka__Group_2__0 ) ) )
            // InternalMyDsl.g:1898:1: ( ( rule__AtributoMocka__Group_2__0 ) )
            {
            // InternalMyDsl.g:1898:1: ( ( rule__AtributoMocka__Group_2__0 ) )
            // InternalMyDsl.g:1899:2: ( rule__AtributoMocka__Group_2__0 )
            {
             before(grammarAccess.getAtributoMockaAccess().getGroup_2()); 
            // InternalMyDsl.g:1900:2: ( rule__AtributoMocka__Group_2__0 )
            // InternalMyDsl.g:1900:3: rule__AtributoMocka__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__AtributoMocka__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getAtributoMockaAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group__2__Impl"


    // $ANTLR start "rule__AtributoMocka__Group__3"
    // InternalMyDsl.g:1908:1: rule__AtributoMocka__Group__3 : rule__AtributoMocka__Group__3__Impl ;
    public final void rule__AtributoMocka__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1912:1: ( rule__AtributoMocka__Group__3__Impl )
            // InternalMyDsl.g:1913:2: rule__AtributoMocka__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtributoMocka__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group__3"


    // $ANTLR start "rule__AtributoMocka__Group__3__Impl"
    // InternalMyDsl.g:1919:1: rule__AtributoMocka__Group__3__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__AtributoMocka__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1923:1: ( ( RULE_SEMICOLON ) )
            // InternalMyDsl.g:1924:1: ( RULE_SEMICOLON )
            {
            // InternalMyDsl.g:1924:1: ( RULE_SEMICOLON )
            // InternalMyDsl.g:1925:2: RULE_SEMICOLON
            {
             before(grammarAccess.getAtributoMockaAccess().getSEMICOLONTerminalRuleCall_3()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getAtributoMockaAccess().getSEMICOLONTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group__3__Impl"


    // $ANTLR start "rule__AtributoMocka__Group_2__0"
    // InternalMyDsl.g:1935:1: rule__AtributoMocka__Group_2__0 : rule__AtributoMocka__Group_2__0__Impl rule__AtributoMocka__Group_2__1 ;
    public final void rule__AtributoMocka__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1939:1: ( rule__AtributoMocka__Group_2__0__Impl rule__AtributoMocka__Group_2__1 )
            // InternalMyDsl.g:1940:2: rule__AtributoMocka__Group_2__0__Impl rule__AtributoMocka__Group_2__1
            {
            pushFollow(FOLLOW_16);
            rule__AtributoMocka__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtributoMocka__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group_2__0"


    // $ANTLR start "rule__AtributoMocka__Group_2__0__Impl"
    // InternalMyDsl.g:1947:1: rule__AtributoMocka__Group_2__0__Impl : ( '(' ) ;
    public final void rule__AtributoMocka__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1951:1: ( ( '(' ) )
            // InternalMyDsl.g:1952:1: ( '(' )
            {
            // InternalMyDsl.g:1952:1: ( '(' )
            // InternalMyDsl.g:1953:2: '('
            {
             before(grammarAccess.getAtributoMockaAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getAtributoMockaAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group_2__0__Impl"


    // $ANTLR start "rule__AtributoMocka__Group_2__1"
    // InternalMyDsl.g:1962:1: rule__AtributoMocka__Group_2__1 : rule__AtributoMocka__Group_2__1__Impl rule__AtributoMocka__Group_2__2 ;
    public final void rule__AtributoMocka__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1966:1: ( rule__AtributoMocka__Group_2__1__Impl rule__AtributoMocka__Group_2__2 )
            // InternalMyDsl.g:1967:2: rule__AtributoMocka__Group_2__1__Impl rule__AtributoMocka__Group_2__2
            {
            pushFollow(FOLLOW_17);
            rule__AtributoMocka__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtributoMocka__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group_2__1"


    // $ANTLR start "rule__AtributoMocka__Group_2__1__Impl"
    // InternalMyDsl.g:1974:1: rule__AtributoMocka__Group_2__1__Impl : ( ( rule__AtributoMocka__Alternatives_2_1 ) ) ;
    public final void rule__AtributoMocka__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1978:1: ( ( ( rule__AtributoMocka__Alternatives_2_1 ) ) )
            // InternalMyDsl.g:1979:1: ( ( rule__AtributoMocka__Alternatives_2_1 ) )
            {
            // InternalMyDsl.g:1979:1: ( ( rule__AtributoMocka__Alternatives_2_1 ) )
            // InternalMyDsl.g:1980:2: ( rule__AtributoMocka__Alternatives_2_1 )
            {
             before(grammarAccess.getAtributoMockaAccess().getAlternatives_2_1()); 
            // InternalMyDsl.g:1981:2: ( rule__AtributoMocka__Alternatives_2_1 )
            // InternalMyDsl.g:1981:3: rule__AtributoMocka__Alternatives_2_1
            {
            pushFollow(FOLLOW_2);
            rule__AtributoMocka__Alternatives_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAtributoMockaAccess().getAlternatives_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group_2__1__Impl"


    // $ANTLR start "rule__AtributoMocka__Group_2__2"
    // InternalMyDsl.g:1989:1: rule__AtributoMocka__Group_2__2 : rule__AtributoMocka__Group_2__2__Impl ;
    public final void rule__AtributoMocka__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1993:1: ( rule__AtributoMocka__Group_2__2__Impl )
            // InternalMyDsl.g:1994:2: rule__AtributoMocka__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtributoMocka__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group_2__2"


    // $ANTLR start "rule__AtributoMocka__Group_2__2__Impl"
    // InternalMyDsl.g:2000:1: rule__AtributoMocka__Group_2__2__Impl : ( ')' ) ;
    public final void rule__AtributoMocka__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2004:1: ( ( ')' ) )
            // InternalMyDsl.g:2005:1: ( ')' )
            {
            // InternalMyDsl.g:2005:1: ( ')' )
            // InternalMyDsl.g:2006:2: ')'
            {
             before(grammarAccess.getAtributoMockaAccess().getRightParenthesisKeyword_2_2()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getAtributoMockaAccess().getRightParenthesisKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group_2__2__Impl"


    // $ANTLR start "rule__AtributoMocka__Group_2_1_0__0"
    // InternalMyDsl.g:2016:1: rule__AtributoMocka__Group_2_1_0__0 : rule__AtributoMocka__Group_2_1_0__0__Impl rule__AtributoMocka__Group_2_1_0__1 ;
    public final void rule__AtributoMocka__Group_2_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2020:1: ( rule__AtributoMocka__Group_2_1_0__0__Impl rule__AtributoMocka__Group_2_1_0__1 )
            // InternalMyDsl.g:2021:2: rule__AtributoMocka__Group_2_1_0__0__Impl rule__AtributoMocka__Group_2_1_0__1
            {
            pushFollow(FOLLOW_4);
            rule__AtributoMocka__Group_2_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtributoMocka__Group_2_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group_2_1_0__0"


    // $ANTLR start "rule__AtributoMocka__Group_2_1_0__0__Impl"
    // InternalMyDsl.g:2028:1: rule__AtributoMocka__Group_2_1_0__0__Impl : ( ( rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0 ) ) ;
    public final void rule__AtributoMocka__Group_2_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2032:1: ( ( ( rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0 ) ) )
            // InternalMyDsl.g:2033:1: ( ( rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0 ) )
            {
            // InternalMyDsl.g:2033:1: ( ( rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0 ) )
            // InternalMyDsl.g:2034:2: ( rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0 )
            {
             before(grammarAccess.getAtributoMockaAccess().getPrimaryKeyAssignment_2_1_0_0()); 
            // InternalMyDsl.g:2035:2: ( rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0 )
            // InternalMyDsl.g:2035:3: rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0
            {
            pushFollow(FOLLOW_2);
            rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0();

            state._fsp--;


            }

             after(grammarAccess.getAtributoMockaAccess().getPrimaryKeyAssignment_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group_2_1_0__0__Impl"


    // $ANTLR start "rule__AtributoMocka__Group_2_1_0__1"
    // InternalMyDsl.g:2043:1: rule__AtributoMocka__Group_2_1_0__1 : rule__AtributoMocka__Group_2_1_0__1__Impl rule__AtributoMocka__Group_2_1_0__2 ;
    public final void rule__AtributoMocka__Group_2_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2047:1: ( rule__AtributoMocka__Group_2_1_0__1__Impl rule__AtributoMocka__Group_2_1_0__2 )
            // InternalMyDsl.g:2048:2: rule__AtributoMocka__Group_2_1_0__1__Impl rule__AtributoMocka__Group_2_1_0__2
            {
            pushFollow(FOLLOW_18);
            rule__AtributoMocka__Group_2_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtributoMocka__Group_2_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group_2_1_0__1"


    // $ANTLR start "rule__AtributoMocka__Group_2_1_0__1__Impl"
    // InternalMyDsl.g:2055:1: rule__AtributoMocka__Group_2_1_0__1__Impl : ( RULE_EQUAL ) ;
    public final void rule__AtributoMocka__Group_2_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2059:1: ( ( RULE_EQUAL ) )
            // InternalMyDsl.g:2060:1: ( RULE_EQUAL )
            {
            // InternalMyDsl.g:2060:1: ( RULE_EQUAL )
            // InternalMyDsl.g:2061:2: RULE_EQUAL
            {
             before(grammarAccess.getAtributoMockaAccess().getEQUALTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_EQUAL,FOLLOW_2); 
             after(grammarAccess.getAtributoMockaAccess().getEQUALTerminalRuleCall_2_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group_2_1_0__1__Impl"


    // $ANTLR start "rule__AtributoMocka__Group_2_1_0__2"
    // InternalMyDsl.g:2070:1: rule__AtributoMocka__Group_2_1_0__2 : rule__AtributoMocka__Group_2_1_0__2__Impl ;
    public final void rule__AtributoMocka__Group_2_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2074:1: ( rule__AtributoMocka__Group_2_1_0__2__Impl )
            // InternalMyDsl.g:2075:2: rule__AtributoMocka__Group_2_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtributoMocka__Group_2_1_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group_2_1_0__2"


    // $ANTLR start "rule__AtributoMocka__Group_2_1_0__2__Impl"
    // InternalMyDsl.g:2081:1: rule__AtributoMocka__Group_2_1_0__2__Impl : ( ( rule__AtributoMocka__MockTypeAssignment_2_1_0_2 ) ) ;
    public final void rule__AtributoMocka__Group_2_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2085:1: ( ( ( rule__AtributoMocka__MockTypeAssignment_2_1_0_2 ) ) )
            // InternalMyDsl.g:2086:1: ( ( rule__AtributoMocka__MockTypeAssignment_2_1_0_2 ) )
            {
            // InternalMyDsl.g:2086:1: ( ( rule__AtributoMocka__MockTypeAssignment_2_1_0_2 ) )
            // InternalMyDsl.g:2087:2: ( rule__AtributoMocka__MockTypeAssignment_2_1_0_2 )
            {
             before(grammarAccess.getAtributoMockaAccess().getMockTypeAssignment_2_1_0_2()); 
            // InternalMyDsl.g:2088:2: ( rule__AtributoMocka__MockTypeAssignment_2_1_0_2 )
            // InternalMyDsl.g:2088:3: rule__AtributoMocka__MockTypeAssignment_2_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__AtributoMocka__MockTypeAssignment_2_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getAtributoMockaAccess().getMockTypeAssignment_2_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group_2_1_0__2__Impl"


    // $ANTLR start "rule__AtributoMocka__Group_2_1_1__0"
    // InternalMyDsl.g:2097:1: rule__AtributoMocka__Group_2_1_1__0 : rule__AtributoMocka__Group_2_1_1__0__Impl rule__AtributoMocka__Group_2_1_1__1 ;
    public final void rule__AtributoMocka__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2101:1: ( rule__AtributoMocka__Group_2_1_1__0__Impl rule__AtributoMocka__Group_2_1_1__1 )
            // InternalMyDsl.g:2102:2: rule__AtributoMocka__Group_2_1_1__0__Impl rule__AtributoMocka__Group_2_1_1__1
            {
            pushFollow(FOLLOW_4);
            rule__AtributoMocka__Group_2_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtributoMocka__Group_2_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group_2_1_1__0"


    // $ANTLR start "rule__AtributoMocka__Group_2_1_1__0__Impl"
    // InternalMyDsl.g:2109:1: rule__AtributoMocka__Group_2_1_1__0__Impl : ( 'mockType' ) ;
    public final void rule__AtributoMocka__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2113:1: ( ( 'mockType' ) )
            // InternalMyDsl.g:2114:1: ( 'mockType' )
            {
            // InternalMyDsl.g:2114:1: ( 'mockType' )
            // InternalMyDsl.g:2115:2: 'mockType'
            {
             before(grammarAccess.getAtributoMockaAccess().getMockTypeKeyword_2_1_1_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getAtributoMockaAccess().getMockTypeKeyword_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group_2_1_1__0__Impl"


    // $ANTLR start "rule__AtributoMocka__Group_2_1_1__1"
    // InternalMyDsl.g:2124:1: rule__AtributoMocka__Group_2_1_1__1 : rule__AtributoMocka__Group_2_1_1__1__Impl rule__AtributoMocka__Group_2_1_1__2 ;
    public final void rule__AtributoMocka__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2128:1: ( rule__AtributoMocka__Group_2_1_1__1__Impl rule__AtributoMocka__Group_2_1_1__2 )
            // InternalMyDsl.g:2129:2: rule__AtributoMocka__Group_2_1_1__1__Impl rule__AtributoMocka__Group_2_1_1__2
            {
            pushFollow(FOLLOW_18);
            rule__AtributoMocka__Group_2_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtributoMocka__Group_2_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group_2_1_1__1"


    // $ANTLR start "rule__AtributoMocka__Group_2_1_1__1__Impl"
    // InternalMyDsl.g:2136:1: rule__AtributoMocka__Group_2_1_1__1__Impl : ( RULE_EQUAL ) ;
    public final void rule__AtributoMocka__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2140:1: ( ( RULE_EQUAL ) )
            // InternalMyDsl.g:2141:1: ( RULE_EQUAL )
            {
            // InternalMyDsl.g:2141:1: ( RULE_EQUAL )
            // InternalMyDsl.g:2142:2: RULE_EQUAL
            {
             before(grammarAccess.getAtributoMockaAccess().getEQUALTerminalRuleCall_2_1_1_1()); 
            match(input,RULE_EQUAL,FOLLOW_2); 
             after(grammarAccess.getAtributoMockaAccess().getEQUALTerminalRuleCall_2_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group_2_1_1__1__Impl"


    // $ANTLR start "rule__AtributoMocka__Group_2_1_1__2"
    // InternalMyDsl.g:2151:1: rule__AtributoMocka__Group_2_1_1__2 : rule__AtributoMocka__Group_2_1_1__2__Impl ;
    public final void rule__AtributoMocka__Group_2_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2155:1: ( rule__AtributoMocka__Group_2_1_1__2__Impl )
            // InternalMyDsl.g:2156:2: rule__AtributoMocka__Group_2_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtributoMocka__Group_2_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group_2_1_1__2"


    // $ANTLR start "rule__AtributoMocka__Group_2_1_1__2__Impl"
    // InternalMyDsl.g:2162:1: rule__AtributoMocka__Group_2_1_1__2__Impl : ( ( rule__AtributoMocka__MockTypeAssignment_2_1_1_2 ) ) ;
    public final void rule__AtributoMocka__Group_2_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2166:1: ( ( ( rule__AtributoMocka__MockTypeAssignment_2_1_1_2 ) ) )
            // InternalMyDsl.g:2167:1: ( ( rule__AtributoMocka__MockTypeAssignment_2_1_1_2 ) )
            {
            // InternalMyDsl.g:2167:1: ( ( rule__AtributoMocka__MockTypeAssignment_2_1_1_2 ) )
            // InternalMyDsl.g:2168:2: ( rule__AtributoMocka__MockTypeAssignment_2_1_1_2 )
            {
             before(grammarAccess.getAtributoMockaAccess().getMockTypeAssignment_2_1_1_2()); 
            // InternalMyDsl.g:2169:2: ( rule__AtributoMocka__MockTypeAssignment_2_1_1_2 )
            // InternalMyDsl.g:2169:3: rule__AtributoMocka__MockTypeAssignment_2_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__AtributoMocka__MockTypeAssignment_2_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAtributoMockaAccess().getMockTypeAssignment_2_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__Group_2_1_1__2__Impl"


    // $ANTLR start "rule__AtributoArreglo__Group__0"
    // InternalMyDsl.g:2178:1: rule__AtributoArreglo__Group__0 : rule__AtributoArreglo__Group__0__Impl rule__AtributoArreglo__Group__1 ;
    public final void rule__AtributoArreglo__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2182:1: ( rule__AtributoArreglo__Group__0__Impl rule__AtributoArreglo__Group__1 )
            // InternalMyDsl.g:2183:2: rule__AtributoArreglo__Group__0__Impl rule__AtributoArreglo__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__AtributoArreglo__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtributoArreglo__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoArreglo__Group__0"


    // $ANTLR start "rule__AtributoArreglo__Group__0__Impl"
    // InternalMyDsl.g:2190:1: rule__AtributoArreglo__Group__0__Impl : ( ( rule__AtributoArreglo__TipoAssignment_0 ) ) ;
    public final void rule__AtributoArreglo__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2194:1: ( ( ( rule__AtributoArreglo__TipoAssignment_0 ) ) )
            // InternalMyDsl.g:2195:1: ( ( rule__AtributoArreglo__TipoAssignment_0 ) )
            {
            // InternalMyDsl.g:2195:1: ( ( rule__AtributoArreglo__TipoAssignment_0 ) )
            // InternalMyDsl.g:2196:2: ( rule__AtributoArreglo__TipoAssignment_0 )
            {
             before(grammarAccess.getAtributoArregloAccess().getTipoAssignment_0()); 
            // InternalMyDsl.g:2197:2: ( rule__AtributoArreglo__TipoAssignment_0 )
            // InternalMyDsl.g:2197:3: rule__AtributoArreglo__TipoAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AtributoArreglo__TipoAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAtributoArregloAccess().getTipoAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoArreglo__Group__0__Impl"


    // $ANTLR start "rule__AtributoArreglo__Group__1"
    // InternalMyDsl.g:2205:1: rule__AtributoArreglo__Group__1 : rule__AtributoArreglo__Group__1__Impl rule__AtributoArreglo__Group__2 ;
    public final void rule__AtributoArreglo__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2209:1: ( rule__AtributoArreglo__Group__1__Impl rule__AtributoArreglo__Group__2 )
            // InternalMyDsl.g:2210:2: rule__AtributoArreglo__Group__1__Impl rule__AtributoArreglo__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__AtributoArreglo__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtributoArreglo__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoArreglo__Group__1"


    // $ANTLR start "rule__AtributoArreglo__Group__1__Impl"
    // InternalMyDsl.g:2217:1: rule__AtributoArreglo__Group__1__Impl : ( '[' ) ;
    public final void rule__AtributoArreglo__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2221:1: ( ( '[' ) )
            // InternalMyDsl.g:2222:1: ( '[' )
            {
            // InternalMyDsl.g:2222:1: ( '[' )
            // InternalMyDsl.g:2223:2: '['
            {
             before(grammarAccess.getAtributoArregloAccess().getLeftSquareBracketKeyword_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getAtributoArregloAccess().getLeftSquareBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoArreglo__Group__1__Impl"


    // $ANTLR start "rule__AtributoArreglo__Group__2"
    // InternalMyDsl.g:2232:1: rule__AtributoArreglo__Group__2 : rule__AtributoArreglo__Group__2__Impl rule__AtributoArreglo__Group__3 ;
    public final void rule__AtributoArreglo__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2236:1: ( rule__AtributoArreglo__Group__2__Impl rule__AtributoArreglo__Group__3 )
            // InternalMyDsl.g:2237:2: rule__AtributoArreglo__Group__2__Impl rule__AtributoArreglo__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__AtributoArreglo__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtributoArreglo__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoArreglo__Group__2"


    // $ANTLR start "rule__AtributoArreglo__Group__2__Impl"
    // InternalMyDsl.g:2244:1: rule__AtributoArreglo__Group__2__Impl : ( ']' ) ;
    public final void rule__AtributoArreglo__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2248:1: ( ( ']' ) )
            // InternalMyDsl.g:2249:1: ( ']' )
            {
            // InternalMyDsl.g:2249:1: ( ']' )
            // InternalMyDsl.g:2250:2: ']'
            {
             before(grammarAccess.getAtributoArregloAccess().getRightSquareBracketKeyword_2()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getAtributoArregloAccess().getRightSquareBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoArreglo__Group__2__Impl"


    // $ANTLR start "rule__AtributoArreglo__Group__3"
    // InternalMyDsl.g:2259:1: rule__AtributoArreglo__Group__3 : rule__AtributoArreglo__Group__3__Impl rule__AtributoArreglo__Group__4 ;
    public final void rule__AtributoArreglo__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2263:1: ( rule__AtributoArreglo__Group__3__Impl rule__AtributoArreglo__Group__4 )
            // InternalMyDsl.g:2264:2: rule__AtributoArreglo__Group__3__Impl rule__AtributoArreglo__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__AtributoArreglo__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtributoArreglo__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoArreglo__Group__3"


    // $ANTLR start "rule__AtributoArreglo__Group__3__Impl"
    // InternalMyDsl.g:2271:1: rule__AtributoArreglo__Group__3__Impl : ( ( rule__AtributoArreglo__NameAssignment_3 ) ) ;
    public final void rule__AtributoArreglo__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2275:1: ( ( ( rule__AtributoArreglo__NameAssignment_3 ) ) )
            // InternalMyDsl.g:2276:1: ( ( rule__AtributoArreglo__NameAssignment_3 ) )
            {
            // InternalMyDsl.g:2276:1: ( ( rule__AtributoArreglo__NameAssignment_3 ) )
            // InternalMyDsl.g:2277:2: ( rule__AtributoArreglo__NameAssignment_3 )
            {
             before(grammarAccess.getAtributoArregloAccess().getNameAssignment_3()); 
            // InternalMyDsl.g:2278:2: ( rule__AtributoArreglo__NameAssignment_3 )
            // InternalMyDsl.g:2278:3: rule__AtributoArreglo__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__AtributoArreglo__NameAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAtributoArregloAccess().getNameAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoArreglo__Group__3__Impl"


    // $ANTLR start "rule__AtributoArreglo__Group__4"
    // InternalMyDsl.g:2286:1: rule__AtributoArreglo__Group__4 : rule__AtributoArreglo__Group__4__Impl ;
    public final void rule__AtributoArreglo__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2290:1: ( rule__AtributoArreglo__Group__4__Impl )
            // InternalMyDsl.g:2291:2: rule__AtributoArreglo__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtributoArreglo__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoArreglo__Group__4"


    // $ANTLR start "rule__AtributoArreglo__Group__4__Impl"
    // InternalMyDsl.g:2297:1: rule__AtributoArreglo__Group__4__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__AtributoArreglo__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2301:1: ( ( RULE_SEMICOLON ) )
            // InternalMyDsl.g:2302:1: ( RULE_SEMICOLON )
            {
            // InternalMyDsl.g:2302:1: ( RULE_SEMICOLON )
            // InternalMyDsl.g:2303:2: RULE_SEMICOLON
            {
             before(grammarAccess.getAtributoArregloAccess().getSEMICOLONTerminalRuleCall_4()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getAtributoArregloAccess().getSEMICOLONTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoArreglo__Group__4__Impl"


    // $ANTLR start "rule__AtributoSimple__Group__0"
    // InternalMyDsl.g:2313:1: rule__AtributoSimple__Group__0 : rule__AtributoSimple__Group__0__Impl rule__AtributoSimple__Group__1 ;
    public final void rule__AtributoSimple__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2317:1: ( rule__AtributoSimple__Group__0__Impl rule__AtributoSimple__Group__1 )
            // InternalMyDsl.g:2318:2: rule__AtributoSimple__Group__0__Impl rule__AtributoSimple__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__AtributoSimple__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtributoSimple__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoSimple__Group__0"


    // $ANTLR start "rule__AtributoSimple__Group__0__Impl"
    // InternalMyDsl.g:2325:1: rule__AtributoSimple__Group__0__Impl : ( ( rule__AtributoSimple__TipoAssignment_0 ) ) ;
    public final void rule__AtributoSimple__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2329:1: ( ( ( rule__AtributoSimple__TipoAssignment_0 ) ) )
            // InternalMyDsl.g:2330:1: ( ( rule__AtributoSimple__TipoAssignment_0 ) )
            {
            // InternalMyDsl.g:2330:1: ( ( rule__AtributoSimple__TipoAssignment_0 ) )
            // InternalMyDsl.g:2331:2: ( rule__AtributoSimple__TipoAssignment_0 )
            {
             before(grammarAccess.getAtributoSimpleAccess().getTipoAssignment_0()); 
            // InternalMyDsl.g:2332:2: ( rule__AtributoSimple__TipoAssignment_0 )
            // InternalMyDsl.g:2332:3: rule__AtributoSimple__TipoAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__AtributoSimple__TipoAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAtributoSimpleAccess().getTipoAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoSimple__Group__0__Impl"


    // $ANTLR start "rule__AtributoSimple__Group__1"
    // InternalMyDsl.g:2340:1: rule__AtributoSimple__Group__1 : rule__AtributoSimple__Group__1__Impl rule__AtributoSimple__Group__2 ;
    public final void rule__AtributoSimple__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2344:1: ( rule__AtributoSimple__Group__1__Impl rule__AtributoSimple__Group__2 )
            // InternalMyDsl.g:2345:2: rule__AtributoSimple__Group__1__Impl rule__AtributoSimple__Group__2
            {
            pushFollow(FOLLOW_6);
            rule__AtributoSimple__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__AtributoSimple__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoSimple__Group__1"


    // $ANTLR start "rule__AtributoSimple__Group__1__Impl"
    // InternalMyDsl.g:2352:1: rule__AtributoSimple__Group__1__Impl : ( ( rule__AtributoSimple__NameAssignment_1 ) ) ;
    public final void rule__AtributoSimple__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2356:1: ( ( ( rule__AtributoSimple__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2357:1: ( ( rule__AtributoSimple__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2357:1: ( ( rule__AtributoSimple__NameAssignment_1 ) )
            // InternalMyDsl.g:2358:2: ( rule__AtributoSimple__NameAssignment_1 )
            {
             before(grammarAccess.getAtributoSimpleAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2359:2: ( rule__AtributoSimple__NameAssignment_1 )
            // InternalMyDsl.g:2359:3: rule__AtributoSimple__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__AtributoSimple__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAtributoSimpleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoSimple__Group__1__Impl"


    // $ANTLR start "rule__AtributoSimple__Group__2"
    // InternalMyDsl.g:2367:1: rule__AtributoSimple__Group__2 : rule__AtributoSimple__Group__2__Impl ;
    public final void rule__AtributoSimple__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2371:1: ( rule__AtributoSimple__Group__2__Impl )
            // InternalMyDsl.g:2372:2: rule__AtributoSimple__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__AtributoSimple__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoSimple__Group__2"


    // $ANTLR start "rule__AtributoSimple__Group__2__Impl"
    // InternalMyDsl.g:2378:1: rule__AtributoSimple__Group__2__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__AtributoSimple__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2382:1: ( ( RULE_SEMICOLON ) )
            // InternalMyDsl.g:2383:1: ( RULE_SEMICOLON )
            {
            // InternalMyDsl.g:2383:1: ( RULE_SEMICOLON )
            // InternalMyDsl.g:2384:2: RULE_SEMICOLON
            {
             before(grammarAccess.getAtributoSimpleAccess().getSEMICOLONTerminalRuleCall_2()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getAtributoSimpleAccess().getSEMICOLONTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoSimple__Group__2__Impl"


    // $ANTLR start "rule__MockarooEntity__Group__0"
    // InternalMyDsl.g:2394:1: rule__MockarooEntity__Group__0 : rule__MockarooEntity__Group__0__Impl rule__MockarooEntity__Group__1 ;
    public final void rule__MockarooEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2398:1: ( rule__MockarooEntity__Group__0__Impl rule__MockarooEntity__Group__1 )
            // InternalMyDsl.g:2399:2: rule__MockarooEntity__Group__0__Impl rule__MockarooEntity__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__MockarooEntity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MockarooEntity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MockarooEntity__Group__0"


    // $ANTLR start "rule__MockarooEntity__Group__0__Impl"
    // InternalMyDsl.g:2406:1: rule__MockarooEntity__Group__0__Impl : ( 'Entity' ) ;
    public final void rule__MockarooEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2410:1: ( ( 'Entity' ) )
            // InternalMyDsl.g:2411:1: ( 'Entity' )
            {
            // InternalMyDsl.g:2411:1: ( 'Entity' )
            // InternalMyDsl.g:2412:2: 'Entity'
            {
             before(grammarAccess.getMockarooEntityAccess().getEntityKeyword_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getMockarooEntityAccess().getEntityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MockarooEntity__Group__0__Impl"


    // $ANTLR start "rule__MockarooEntity__Group__1"
    // InternalMyDsl.g:2421:1: rule__MockarooEntity__Group__1 : rule__MockarooEntity__Group__1__Impl rule__MockarooEntity__Group__2 ;
    public final void rule__MockarooEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2425:1: ( rule__MockarooEntity__Group__1__Impl rule__MockarooEntity__Group__2 )
            // InternalMyDsl.g:2426:2: rule__MockarooEntity__Group__1__Impl rule__MockarooEntity__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__MockarooEntity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MockarooEntity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MockarooEntity__Group__1"


    // $ANTLR start "rule__MockarooEntity__Group__1__Impl"
    // InternalMyDsl.g:2433:1: rule__MockarooEntity__Group__1__Impl : ( ( rule__MockarooEntity__NameAssignment_1 ) ) ;
    public final void rule__MockarooEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2437:1: ( ( ( rule__MockarooEntity__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2438:1: ( ( rule__MockarooEntity__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2438:1: ( ( rule__MockarooEntity__NameAssignment_1 ) )
            // InternalMyDsl.g:2439:2: ( rule__MockarooEntity__NameAssignment_1 )
            {
             before(grammarAccess.getMockarooEntityAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2440:2: ( rule__MockarooEntity__NameAssignment_1 )
            // InternalMyDsl.g:2440:3: rule__MockarooEntity__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MockarooEntity__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMockarooEntityAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MockarooEntity__Group__1__Impl"


    // $ANTLR start "rule__MockarooEntity__Group__2"
    // InternalMyDsl.g:2448:1: rule__MockarooEntity__Group__2 : rule__MockarooEntity__Group__2__Impl rule__MockarooEntity__Group__3 ;
    public final void rule__MockarooEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2452:1: ( rule__MockarooEntity__Group__2__Impl rule__MockarooEntity__Group__3 )
            // InternalMyDsl.g:2453:2: rule__MockarooEntity__Group__2__Impl rule__MockarooEntity__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__MockarooEntity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MockarooEntity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MockarooEntity__Group__2"


    // $ANTLR start "rule__MockarooEntity__Group__2__Impl"
    // InternalMyDsl.g:2460:1: rule__MockarooEntity__Group__2__Impl : ( '{' ) ;
    public final void rule__MockarooEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2464:1: ( ( '{' ) )
            // InternalMyDsl.g:2465:1: ( '{' )
            {
            // InternalMyDsl.g:2465:1: ( '{' )
            // InternalMyDsl.g:2466:2: '{'
            {
             before(grammarAccess.getMockarooEntityAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getMockarooEntityAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MockarooEntity__Group__2__Impl"


    // $ANTLR start "rule__MockarooEntity__Group__3"
    // InternalMyDsl.g:2475:1: rule__MockarooEntity__Group__3 : rule__MockarooEntity__Group__3__Impl rule__MockarooEntity__Group__4 ;
    public final void rule__MockarooEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2479:1: ( rule__MockarooEntity__Group__3__Impl rule__MockarooEntity__Group__4 )
            // InternalMyDsl.g:2480:2: rule__MockarooEntity__Group__3__Impl rule__MockarooEntity__Group__4
            {
            pushFollow(FOLLOW_14);
            rule__MockarooEntity__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MockarooEntity__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MockarooEntity__Group__3"


    // $ANTLR start "rule__MockarooEntity__Group__3__Impl"
    // InternalMyDsl.g:2487:1: rule__MockarooEntity__Group__3__Impl : ( ( rule__MockarooEntity__AtributosAssignment_3 )* ) ;
    public final void rule__MockarooEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2491:1: ( ( ( rule__MockarooEntity__AtributosAssignment_3 )* ) )
            // InternalMyDsl.g:2492:1: ( ( rule__MockarooEntity__AtributosAssignment_3 )* )
            {
            // InternalMyDsl.g:2492:1: ( ( rule__MockarooEntity__AtributosAssignment_3 )* )
            // InternalMyDsl.g:2493:2: ( rule__MockarooEntity__AtributosAssignment_3 )*
            {
             before(grammarAccess.getMockarooEntityAccess().getAtributosAssignment_3()); 
            // InternalMyDsl.g:2494:2: ( rule__MockarooEntity__AtributosAssignment_3 )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( ((LA23_0>=15 && LA23_0<=17)) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // InternalMyDsl.g:2494:3: rule__MockarooEntity__AtributosAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__MockarooEntity__AtributosAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

             after(grammarAccess.getMockarooEntityAccess().getAtributosAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MockarooEntity__Group__3__Impl"


    // $ANTLR start "rule__MockarooEntity__Group__4"
    // InternalMyDsl.g:2502:1: rule__MockarooEntity__Group__4 : rule__MockarooEntity__Group__4__Impl ;
    public final void rule__MockarooEntity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2506:1: ( rule__MockarooEntity__Group__4__Impl )
            // InternalMyDsl.g:2507:2: rule__MockarooEntity__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MockarooEntity__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MockarooEntity__Group__4"


    // $ANTLR start "rule__MockarooEntity__Group__4__Impl"
    // InternalMyDsl.g:2513:1: rule__MockarooEntity__Group__4__Impl : ( '}' ) ;
    public final void rule__MockarooEntity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2517:1: ( ( '}' ) )
            // InternalMyDsl.g:2518:1: ( '}' )
            {
            // InternalMyDsl.g:2518:1: ( '}' )
            // InternalMyDsl.g:2519:2: '}'
            {
             before(grammarAccess.getMockarooEntityAccess().getRightCurlyBracketKeyword_4()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getMockarooEntityAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MockarooEntity__Group__4__Impl"


    // $ANTLR start "rule__ServicioRest__Group__0"
    // InternalMyDsl.g:2529:1: rule__ServicioRest__Group__0 : rule__ServicioRest__Group__0__Impl rule__ServicioRest__Group__1 ;
    public final void rule__ServicioRest__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2533:1: ( rule__ServicioRest__Group__0__Impl rule__ServicioRest__Group__1 )
            // InternalMyDsl.g:2534:2: rule__ServicioRest__Group__0__Impl rule__ServicioRest__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__ServicioRest__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServicioRest__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServicioRest__Group__0"


    // $ANTLR start "rule__ServicioRest__Group__0__Impl"
    // InternalMyDsl.g:2541:1: rule__ServicioRest__Group__0__Impl : ( ( rule__ServicioRest__MetodoAssignment_0 ) ) ;
    public final void rule__ServicioRest__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2545:1: ( ( ( rule__ServicioRest__MetodoAssignment_0 ) ) )
            // InternalMyDsl.g:2546:1: ( ( rule__ServicioRest__MetodoAssignment_0 ) )
            {
            // InternalMyDsl.g:2546:1: ( ( rule__ServicioRest__MetodoAssignment_0 ) )
            // InternalMyDsl.g:2547:2: ( rule__ServicioRest__MetodoAssignment_0 )
            {
             before(grammarAccess.getServicioRestAccess().getMetodoAssignment_0()); 
            // InternalMyDsl.g:2548:2: ( rule__ServicioRest__MetodoAssignment_0 )
            // InternalMyDsl.g:2548:3: rule__ServicioRest__MetodoAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__ServicioRest__MetodoAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getServicioRestAccess().getMetodoAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServicioRest__Group__0__Impl"


    // $ANTLR start "rule__ServicioRest__Group__1"
    // InternalMyDsl.g:2556:1: rule__ServicioRest__Group__1 : rule__ServicioRest__Group__1__Impl rule__ServicioRest__Group__2 ;
    public final void rule__ServicioRest__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2560:1: ( rule__ServicioRest__Group__1__Impl rule__ServicioRest__Group__2 )
            // InternalMyDsl.g:2561:2: rule__ServicioRest__Group__1__Impl rule__ServicioRest__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__ServicioRest__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServicioRest__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServicioRest__Group__1"


    // $ANTLR start "rule__ServicioRest__Group__1__Impl"
    // InternalMyDsl.g:2568:1: rule__ServicioRest__Group__1__Impl : ( ( rule__ServicioRest__NameAssignment_1 ) ) ;
    public final void rule__ServicioRest__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2572:1: ( ( ( rule__ServicioRest__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2573:1: ( ( rule__ServicioRest__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2573:1: ( ( rule__ServicioRest__NameAssignment_1 ) )
            // InternalMyDsl.g:2574:2: ( rule__ServicioRest__NameAssignment_1 )
            {
             before(grammarAccess.getServicioRestAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2575:2: ( rule__ServicioRest__NameAssignment_1 )
            // InternalMyDsl.g:2575:3: rule__ServicioRest__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__ServicioRest__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getServicioRestAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServicioRest__Group__1__Impl"


    // $ANTLR start "rule__ServicioRest__Group__2"
    // InternalMyDsl.g:2583:1: rule__ServicioRest__Group__2 : rule__ServicioRest__Group__2__Impl rule__ServicioRest__Group__3 ;
    public final void rule__ServicioRest__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2587:1: ( rule__ServicioRest__Group__2__Impl rule__ServicioRest__Group__3 )
            // InternalMyDsl.g:2588:2: rule__ServicioRest__Group__2__Impl rule__ServicioRest__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__ServicioRest__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServicioRest__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServicioRest__Group__2"


    // $ANTLR start "rule__ServicioRest__Group__2__Impl"
    // InternalMyDsl.g:2595:1: rule__ServicioRest__Group__2__Impl : ( '{' ) ;
    public final void rule__ServicioRest__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2599:1: ( ( '{' ) )
            // InternalMyDsl.g:2600:1: ( '{' )
            {
            // InternalMyDsl.g:2600:1: ( '{' )
            // InternalMyDsl.g:2601:2: '{'
            {
             before(grammarAccess.getServicioRestAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getServicioRestAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServicioRest__Group__2__Impl"


    // $ANTLR start "rule__ServicioRest__Group__3"
    // InternalMyDsl.g:2610:1: rule__ServicioRest__Group__3 : rule__ServicioRest__Group__3__Impl rule__ServicioRest__Group__4 ;
    public final void rule__ServicioRest__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2614:1: ( rule__ServicioRest__Group__3__Impl rule__ServicioRest__Group__4 )
            // InternalMyDsl.g:2615:2: rule__ServicioRest__Group__3__Impl rule__ServicioRest__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__ServicioRest__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServicioRest__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServicioRest__Group__3"


    // $ANTLR start "rule__ServicioRest__Group__3__Impl"
    // InternalMyDsl.g:2622:1: rule__ServicioRest__Group__3__Impl : ( 'URL' ) ;
    public final void rule__ServicioRest__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2626:1: ( ( 'URL' ) )
            // InternalMyDsl.g:2627:1: ( 'URL' )
            {
            // InternalMyDsl.g:2627:1: ( 'URL' )
            // InternalMyDsl.g:2628:2: 'URL'
            {
             before(grammarAccess.getServicioRestAccess().getURLKeyword_3()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getServicioRestAccess().getURLKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServicioRest__Group__3__Impl"


    // $ANTLR start "rule__ServicioRest__Group__4"
    // InternalMyDsl.g:2637:1: rule__ServicioRest__Group__4 : rule__ServicioRest__Group__4__Impl rule__ServicioRest__Group__5 ;
    public final void rule__ServicioRest__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2641:1: ( rule__ServicioRest__Group__4__Impl rule__ServicioRest__Group__5 )
            // InternalMyDsl.g:2642:2: rule__ServicioRest__Group__4__Impl rule__ServicioRest__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__ServicioRest__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServicioRest__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServicioRest__Group__4"


    // $ANTLR start "rule__ServicioRest__Group__4__Impl"
    // InternalMyDsl.g:2649:1: rule__ServicioRest__Group__4__Impl : ( RULE_EQUAL ) ;
    public final void rule__ServicioRest__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2653:1: ( ( RULE_EQUAL ) )
            // InternalMyDsl.g:2654:1: ( RULE_EQUAL )
            {
            // InternalMyDsl.g:2654:1: ( RULE_EQUAL )
            // InternalMyDsl.g:2655:2: RULE_EQUAL
            {
             before(grammarAccess.getServicioRestAccess().getEQUALTerminalRuleCall_4()); 
            match(input,RULE_EQUAL,FOLLOW_2); 
             after(grammarAccess.getServicioRestAccess().getEQUALTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServicioRest__Group__4__Impl"


    // $ANTLR start "rule__ServicioRest__Group__5"
    // InternalMyDsl.g:2664:1: rule__ServicioRest__Group__5 : rule__ServicioRest__Group__5__Impl rule__ServicioRest__Group__6 ;
    public final void rule__ServicioRest__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2668:1: ( rule__ServicioRest__Group__5__Impl rule__ServicioRest__Group__6 )
            // InternalMyDsl.g:2669:2: rule__ServicioRest__Group__5__Impl rule__ServicioRest__Group__6
            {
            pushFollow(FOLLOW_6);
            rule__ServicioRest__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServicioRest__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServicioRest__Group__5"


    // $ANTLR start "rule__ServicioRest__Group__5__Impl"
    // InternalMyDsl.g:2676:1: rule__ServicioRest__Group__5__Impl : ( ( rule__ServicioRest__UrlAssignment_5 ) ) ;
    public final void rule__ServicioRest__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2680:1: ( ( ( rule__ServicioRest__UrlAssignment_5 ) ) )
            // InternalMyDsl.g:2681:1: ( ( rule__ServicioRest__UrlAssignment_5 ) )
            {
            // InternalMyDsl.g:2681:1: ( ( rule__ServicioRest__UrlAssignment_5 ) )
            // InternalMyDsl.g:2682:2: ( rule__ServicioRest__UrlAssignment_5 )
            {
             before(grammarAccess.getServicioRestAccess().getUrlAssignment_5()); 
            // InternalMyDsl.g:2683:2: ( rule__ServicioRest__UrlAssignment_5 )
            // InternalMyDsl.g:2683:3: rule__ServicioRest__UrlAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__ServicioRest__UrlAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getServicioRestAccess().getUrlAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServicioRest__Group__5__Impl"


    // $ANTLR start "rule__ServicioRest__Group__6"
    // InternalMyDsl.g:2691:1: rule__ServicioRest__Group__6 : rule__ServicioRest__Group__6__Impl rule__ServicioRest__Group__7 ;
    public final void rule__ServicioRest__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2695:1: ( rule__ServicioRest__Group__6__Impl rule__ServicioRest__Group__7 )
            // InternalMyDsl.g:2696:2: rule__ServicioRest__Group__6__Impl rule__ServicioRest__Group__7
            {
            pushFollow(FOLLOW_23);
            rule__ServicioRest__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServicioRest__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServicioRest__Group__6"


    // $ANTLR start "rule__ServicioRest__Group__6__Impl"
    // InternalMyDsl.g:2703:1: rule__ServicioRest__Group__6__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__ServicioRest__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2707:1: ( ( RULE_SEMICOLON ) )
            // InternalMyDsl.g:2708:1: ( RULE_SEMICOLON )
            {
            // InternalMyDsl.g:2708:1: ( RULE_SEMICOLON )
            // InternalMyDsl.g:2709:2: RULE_SEMICOLON
            {
             before(grammarAccess.getServicioRestAccess().getSEMICOLONTerminalRuleCall_6()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getServicioRestAccess().getSEMICOLONTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServicioRest__Group__6__Impl"


    // $ANTLR start "rule__ServicioRest__Group__7"
    // InternalMyDsl.g:2718:1: rule__ServicioRest__Group__7 : rule__ServicioRest__Group__7__Impl rule__ServicioRest__Group__8 ;
    public final void rule__ServicioRest__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2722:1: ( rule__ServicioRest__Group__7__Impl rule__ServicioRest__Group__8 )
            // InternalMyDsl.g:2723:2: rule__ServicioRest__Group__7__Impl rule__ServicioRest__Group__8
            {
            pushFollow(FOLLOW_23);
            rule__ServicioRest__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServicioRest__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServicioRest__Group__7"


    // $ANTLR start "rule__ServicioRest__Group__7__Impl"
    // InternalMyDsl.g:2730:1: rule__ServicioRest__Group__7__Impl : ( ( rule__ServicioRest__RequestAssignment_7 )? ) ;
    public final void rule__ServicioRest__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2734:1: ( ( ( rule__ServicioRest__RequestAssignment_7 )? ) )
            // InternalMyDsl.g:2735:1: ( ( rule__ServicioRest__RequestAssignment_7 )? )
            {
            // InternalMyDsl.g:2735:1: ( ( rule__ServicioRest__RequestAssignment_7 )? )
            // InternalMyDsl.g:2736:2: ( rule__ServicioRest__RequestAssignment_7 )?
            {
             before(grammarAccess.getServicioRestAccess().getRequestAssignment_7()); 
            // InternalMyDsl.g:2737:2: ( rule__ServicioRest__RequestAssignment_7 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==58) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMyDsl.g:2737:3: rule__ServicioRest__RequestAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__ServicioRest__RequestAssignment_7();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getServicioRestAccess().getRequestAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServicioRest__Group__7__Impl"


    // $ANTLR start "rule__ServicioRest__Group__8"
    // InternalMyDsl.g:2745:1: rule__ServicioRest__Group__8 : rule__ServicioRest__Group__8__Impl rule__ServicioRest__Group__9 ;
    public final void rule__ServicioRest__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2749:1: ( rule__ServicioRest__Group__8__Impl rule__ServicioRest__Group__9 )
            // InternalMyDsl.g:2750:2: rule__ServicioRest__Group__8__Impl rule__ServicioRest__Group__9
            {
            pushFollow(FOLLOW_24);
            rule__ServicioRest__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ServicioRest__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServicioRest__Group__8"


    // $ANTLR start "rule__ServicioRest__Group__8__Impl"
    // InternalMyDsl.g:2757:1: rule__ServicioRest__Group__8__Impl : ( ( rule__ServicioRest__ResponseAssignment_8 ) ) ;
    public final void rule__ServicioRest__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2761:1: ( ( ( rule__ServicioRest__ResponseAssignment_8 ) ) )
            // InternalMyDsl.g:2762:1: ( ( rule__ServicioRest__ResponseAssignment_8 ) )
            {
            // InternalMyDsl.g:2762:1: ( ( rule__ServicioRest__ResponseAssignment_8 ) )
            // InternalMyDsl.g:2763:2: ( rule__ServicioRest__ResponseAssignment_8 )
            {
             before(grammarAccess.getServicioRestAccess().getResponseAssignment_8()); 
            // InternalMyDsl.g:2764:2: ( rule__ServicioRest__ResponseAssignment_8 )
            // InternalMyDsl.g:2764:3: rule__ServicioRest__ResponseAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__ServicioRest__ResponseAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getServicioRestAccess().getResponseAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServicioRest__Group__8__Impl"


    // $ANTLR start "rule__ServicioRest__Group__9"
    // InternalMyDsl.g:2772:1: rule__ServicioRest__Group__9 : rule__ServicioRest__Group__9__Impl ;
    public final void rule__ServicioRest__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2776:1: ( rule__ServicioRest__Group__9__Impl )
            // InternalMyDsl.g:2777:2: rule__ServicioRest__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ServicioRest__Group__9__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServicioRest__Group__9"


    // $ANTLR start "rule__ServicioRest__Group__9__Impl"
    // InternalMyDsl.g:2783:1: rule__ServicioRest__Group__9__Impl : ( '}' ) ;
    public final void rule__ServicioRest__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2787:1: ( ( '}' ) )
            // InternalMyDsl.g:2788:1: ( '}' )
            {
            // InternalMyDsl.g:2788:1: ( '}' )
            // InternalMyDsl.g:2789:2: '}'
            {
             before(grammarAccess.getServicioRestAccess().getRightCurlyBracketKeyword_9()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getServicioRestAccess().getRightCurlyBracketKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServicioRest__Group__9__Impl"


    // $ANTLR start "rule__Url__Group__0"
    // InternalMyDsl.g:2799:1: rule__Url__Group__0 : rule__Url__Group__0__Impl rule__Url__Group__1 ;
    public final void rule__Url__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2803:1: ( rule__Url__Group__0__Impl rule__Url__Group__1 )
            // InternalMyDsl.g:2804:2: rule__Url__Group__0__Impl rule__Url__Group__1
            {
            pushFollow(FOLLOW_22);
            rule__Url__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Url__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Url__Group__0"


    // $ANTLR start "rule__Url__Group__0__Impl"
    // InternalMyDsl.g:2811:1: rule__Url__Group__0__Impl : ( () ) ;
    public final void rule__Url__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2815:1: ( ( () ) )
            // InternalMyDsl.g:2816:1: ( () )
            {
            // InternalMyDsl.g:2816:1: ( () )
            // InternalMyDsl.g:2817:2: ()
            {
             before(grammarAccess.getUrlAccess().getUrlAction_0()); 
            // InternalMyDsl.g:2818:2: ()
            // InternalMyDsl.g:2818:3: 
            {
            }

             after(grammarAccess.getUrlAccess().getUrlAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Url__Group__0__Impl"


    // $ANTLR start "rule__Url__Group__1"
    // InternalMyDsl.g:2826:1: rule__Url__Group__1 : rule__Url__Group__1__Impl ;
    public final void rule__Url__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2830:1: ( rule__Url__Group__1__Impl )
            // InternalMyDsl.g:2831:2: rule__Url__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Url__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Url__Group__1"


    // $ANTLR start "rule__Url__Group__1__Impl"
    // InternalMyDsl.g:2837:1: rule__Url__Group__1__Impl : ( ( ( rule__Url__UrlexpresionsAssignment_1 ) ) ( ( rule__Url__UrlexpresionsAssignment_1 )* ) ) ;
    public final void rule__Url__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2841:1: ( ( ( ( rule__Url__UrlexpresionsAssignment_1 ) ) ( ( rule__Url__UrlexpresionsAssignment_1 )* ) ) )
            // InternalMyDsl.g:2842:1: ( ( ( rule__Url__UrlexpresionsAssignment_1 ) ) ( ( rule__Url__UrlexpresionsAssignment_1 )* ) )
            {
            // InternalMyDsl.g:2842:1: ( ( ( rule__Url__UrlexpresionsAssignment_1 ) ) ( ( rule__Url__UrlexpresionsAssignment_1 )* ) )
            // InternalMyDsl.g:2843:2: ( ( rule__Url__UrlexpresionsAssignment_1 ) ) ( ( rule__Url__UrlexpresionsAssignment_1 )* )
            {
            // InternalMyDsl.g:2843:2: ( ( rule__Url__UrlexpresionsAssignment_1 ) )
            // InternalMyDsl.g:2844:3: ( rule__Url__UrlexpresionsAssignment_1 )
            {
             before(grammarAccess.getUrlAccess().getUrlexpresionsAssignment_1()); 
            // InternalMyDsl.g:2845:3: ( rule__Url__UrlexpresionsAssignment_1 )
            // InternalMyDsl.g:2845:4: rule__Url__UrlexpresionsAssignment_1
            {
            pushFollow(FOLLOW_25);
            rule__Url__UrlexpresionsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getUrlAccess().getUrlexpresionsAssignment_1()); 

            }

            // InternalMyDsl.g:2848:2: ( ( rule__Url__UrlexpresionsAssignment_1 )* )
            // InternalMyDsl.g:2849:3: ( rule__Url__UrlexpresionsAssignment_1 )*
            {
             before(grammarAccess.getUrlAccess().getUrlexpresionsAssignment_1()); 
            // InternalMyDsl.g:2850:3: ( rule__Url__UrlexpresionsAssignment_1 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=52 && LA25_0<=55)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMyDsl.g:2850:4: rule__Url__UrlexpresionsAssignment_1
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__Url__UrlexpresionsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getUrlAccess().getUrlexpresionsAssignment_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Url__Group__1__Impl"


    // $ANTLR start "rule__StringType__Group__0"
    // InternalMyDsl.g:2860:1: rule__StringType__Group__0 : rule__StringType__Group__0__Impl rule__StringType__Group__1 ;
    public final void rule__StringType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2864:1: ( rule__StringType__Group__0__Impl rule__StringType__Group__1 )
            // InternalMyDsl.g:2865:2: rule__StringType__Group__0__Impl rule__StringType__Group__1
            {
            pushFollow(FOLLOW_26);
            rule__StringType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group__0"


    // $ANTLR start "rule__StringType__Group__0__Impl"
    // InternalMyDsl.g:2872:1: rule__StringType__Group__0__Impl : ( () ) ;
    public final void rule__StringType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2876:1: ( ( () ) )
            // InternalMyDsl.g:2877:1: ( () )
            {
            // InternalMyDsl.g:2877:1: ( () )
            // InternalMyDsl.g:2878:2: ()
            {
             before(grammarAccess.getStringTypeAccess().getStringTypeAction_0()); 
            // InternalMyDsl.g:2879:2: ()
            // InternalMyDsl.g:2879:3: 
            {
            }

             after(grammarAccess.getStringTypeAccess().getStringTypeAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group__0__Impl"


    // $ANTLR start "rule__StringType__Group__1"
    // InternalMyDsl.g:2887:1: rule__StringType__Group__1 : rule__StringType__Group__1__Impl rule__StringType__Group__2 ;
    public final void rule__StringType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2891:1: ( rule__StringType__Group__1__Impl rule__StringType__Group__2 )
            // InternalMyDsl.g:2892:2: rule__StringType__Group__1__Impl rule__StringType__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__StringType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StringType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group__1"


    // $ANTLR start "rule__StringType__Group__1__Impl"
    // InternalMyDsl.g:2899:1: rule__StringType__Group__1__Impl : ( '/' ) ;
    public final void rule__StringType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2903:1: ( ( '/' ) )
            // InternalMyDsl.g:2904:1: ( '/' )
            {
            // InternalMyDsl.g:2904:1: ( '/' )
            // InternalMyDsl.g:2905:2: '/'
            {
             before(grammarAccess.getStringTypeAccess().getSolidusKeyword_1()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getStringTypeAccess().getSolidusKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group__1__Impl"


    // $ANTLR start "rule__StringType__Group__2"
    // InternalMyDsl.g:2914:1: rule__StringType__Group__2 : rule__StringType__Group__2__Impl ;
    public final void rule__StringType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2918:1: ( rule__StringType__Group__2__Impl )
            // InternalMyDsl.g:2919:2: rule__StringType__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StringType__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group__2"


    // $ANTLR start "rule__StringType__Group__2__Impl"
    // InternalMyDsl.g:2925:1: rule__StringType__Group__2__Impl : ( ( rule__StringType__TextAssignment_2 ) ) ;
    public final void rule__StringType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2929:1: ( ( ( rule__StringType__TextAssignment_2 ) ) )
            // InternalMyDsl.g:2930:1: ( ( rule__StringType__TextAssignment_2 ) )
            {
            // InternalMyDsl.g:2930:1: ( ( rule__StringType__TextAssignment_2 ) )
            // InternalMyDsl.g:2931:2: ( rule__StringType__TextAssignment_2 )
            {
             before(grammarAccess.getStringTypeAccess().getTextAssignment_2()); 
            // InternalMyDsl.g:2932:2: ( rule__StringType__TextAssignment_2 )
            // InternalMyDsl.g:2932:3: rule__StringType__TextAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__StringType__TextAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getStringTypeAccess().getTextAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__Group__2__Impl"


    // $ANTLR start "rule__QueryParam__Group__0"
    // InternalMyDsl.g:2941:1: rule__QueryParam__Group__0 : rule__QueryParam__Group__0__Impl rule__QueryParam__Group__1 ;
    public final void rule__QueryParam__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2945:1: ( rule__QueryParam__Group__0__Impl rule__QueryParam__Group__1 )
            // InternalMyDsl.g:2946:2: rule__QueryParam__Group__0__Impl rule__QueryParam__Group__1
            {
            pushFollow(FOLLOW_27);
            rule__QueryParam__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QueryParam__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryParam__Group__0"


    // $ANTLR start "rule__QueryParam__Group__0__Impl"
    // InternalMyDsl.g:2953:1: rule__QueryParam__Group__0__Impl : ( ( '?' )? ) ;
    public final void rule__QueryParam__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2957:1: ( ( ( '?' )? ) )
            // InternalMyDsl.g:2958:1: ( ( '?' )? )
            {
            // InternalMyDsl.g:2958:1: ( ( '?' )? )
            // InternalMyDsl.g:2959:2: ( '?' )?
            {
             before(grammarAccess.getQueryParamAccess().getQuestionMarkKeyword_0()); 
            // InternalMyDsl.g:2960:2: ( '?' )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==53) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMyDsl.g:2960:3: '?'
                    {
                    match(input,53,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getQueryParamAccess().getQuestionMarkKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryParam__Group__0__Impl"


    // $ANTLR start "rule__QueryParam__Group__1"
    // InternalMyDsl.g:2968:1: rule__QueryParam__Group__1 : rule__QueryParam__Group__1__Impl rule__QueryParam__Group__2 ;
    public final void rule__QueryParam__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2972:1: ( rule__QueryParam__Group__1__Impl rule__QueryParam__Group__2 )
            // InternalMyDsl.g:2973:2: rule__QueryParam__Group__1__Impl rule__QueryParam__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__QueryParam__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QueryParam__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryParam__Group__1"


    // $ANTLR start "rule__QueryParam__Group__1__Impl"
    // InternalMyDsl.g:2980:1: rule__QueryParam__Group__1__Impl : ( '${' ) ;
    public final void rule__QueryParam__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2984:1: ( ( '${' ) )
            // InternalMyDsl.g:2985:1: ( '${' )
            {
            // InternalMyDsl.g:2985:1: ( '${' )
            // InternalMyDsl.g:2986:2: '${'
            {
             before(grammarAccess.getQueryParamAccess().getDollarSignLeftCurlyBracketKeyword_1()); 
            match(input,54,FOLLOW_2); 
             after(grammarAccess.getQueryParamAccess().getDollarSignLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryParam__Group__1__Impl"


    // $ANTLR start "rule__QueryParam__Group__2"
    // InternalMyDsl.g:2995:1: rule__QueryParam__Group__2 : rule__QueryParam__Group__2__Impl rule__QueryParam__Group__3 ;
    public final void rule__QueryParam__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2999:1: ( rule__QueryParam__Group__2__Impl rule__QueryParam__Group__3 )
            // InternalMyDsl.g:3000:2: rule__QueryParam__Group__2__Impl rule__QueryParam__Group__3
            {
            pushFollow(FOLLOW_24);
            rule__QueryParam__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QueryParam__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryParam__Group__2"


    // $ANTLR start "rule__QueryParam__Group__2__Impl"
    // InternalMyDsl.g:3007:1: rule__QueryParam__Group__2__Impl : ( ( rule__QueryParam__NameAssignment_2 ) ) ;
    public final void rule__QueryParam__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3011:1: ( ( ( rule__QueryParam__NameAssignment_2 ) ) )
            // InternalMyDsl.g:3012:1: ( ( rule__QueryParam__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:3012:1: ( ( rule__QueryParam__NameAssignment_2 ) )
            // InternalMyDsl.g:3013:2: ( rule__QueryParam__NameAssignment_2 )
            {
             before(grammarAccess.getQueryParamAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:3014:2: ( rule__QueryParam__NameAssignment_2 )
            // InternalMyDsl.g:3014:3: rule__QueryParam__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__QueryParam__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getQueryParamAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryParam__Group__2__Impl"


    // $ANTLR start "rule__QueryParam__Group__3"
    // InternalMyDsl.g:3022:1: rule__QueryParam__Group__3 : rule__QueryParam__Group__3__Impl ;
    public final void rule__QueryParam__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3026:1: ( rule__QueryParam__Group__3__Impl )
            // InternalMyDsl.g:3027:2: rule__QueryParam__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QueryParam__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryParam__Group__3"


    // $ANTLR start "rule__QueryParam__Group__3__Impl"
    // InternalMyDsl.g:3033:1: rule__QueryParam__Group__3__Impl : ( '}' ) ;
    public final void rule__QueryParam__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3037:1: ( ( '}' ) )
            // InternalMyDsl.g:3038:1: ( '}' )
            {
            // InternalMyDsl.g:3038:1: ( '}' )
            // InternalMyDsl.g:3039:2: '}'
            {
             before(grammarAccess.getQueryParamAccess().getRightCurlyBracketKeyword_3()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getQueryParamAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryParam__Group__3__Impl"


    // $ANTLR start "rule__PathParam__Group__0"
    // InternalMyDsl.g:3049:1: rule__PathParam__Group__0 : rule__PathParam__Group__0__Impl rule__PathParam__Group__1 ;
    public final void rule__PathParam__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3053:1: ( rule__PathParam__Group__0__Impl rule__PathParam__Group__1 )
            // InternalMyDsl.g:3054:2: rule__PathParam__Group__0__Impl rule__PathParam__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__PathParam__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PathParam__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathParam__Group__0"


    // $ANTLR start "rule__PathParam__Group__0__Impl"
    // InternalMyDsl.g:3061:1: rule__PathParam__Group__0__Impl : ( '/:{' ) ;
    public final void rule__PathParam__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3065:1: ( ( '/:{' ) )
            // InternalMyDsl.g:3066:1: ( '/:{' )
            {
            // InternalMyDsl.g:3066:1: ( '/:{' )
            // InternalMyDsl.g:3067:2: '/:{'
            {
             before(grammarAccess.getPathParamAccess().getSolidusColonLeftCurlyBracketKeyword_0()); 
            match(input,55,FOLLOW_2); 
             after(grammarAccess.getPathParamAccess().getSolidusColonLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathParam__Group__0__Impl"


    // $ANTLR start "rule__PathParam__Group__1"
    // InternalMyDsl.g:3076:1: rule__PathParam__Group__1 : rule__PathParam__Group__1__Impl rule__PathParam__Group__2 ;
    public final void rule__PathParam__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3080:1: ( rule__PathParam__Group__1__Impl rule__PathParam__Group__2 )
            // InternalMyDsl.g:3081:2: rule__PathParam__Group__1__Impl rule__PathParam__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__PathParam__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PathParam__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathParam__Group__1"


    // $ANTLR start "rule__PathParam__Group__1__Impl"
    // InternalMyDsl.g:3088:1: rule__PathParam__Group__1__Impl : ( ( rule__PathParam__NameAssignment_1 ) ) ;
    public final void rule__PathParam__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3092:1: ( ( ( rule__PathParam__NameAssignment_1 ) ) )
            // InternalMyDsl.g:3093:1: ( ( rule__PathParam__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:3093:1: ( ( rule__PathParam__NameAssignment_1 ) )
            // InternalMyDsl.g:3094:2: ( rule__PathParam__NameAssignment_1 )
            {
             before(grammarAccess.getPathParamAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:3095:2: ( rule__PathParam__NameAssignment_1 )
            // InternalMyDsl.g:3095:3: rule__PathParam__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PathParam__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPathParamAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathParam__Group__1__Impl"


    // $ANTLR start "rule__PathParam__Group__2"
    // InternalMyDsl.g:3103:1: rule__PathParam__Group__2 : rule__PathParam__Group__2__Impl ;
    public final void rule__PathParam__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3107:1: ( rule__PathParam__Group__2__Impl )
            // InternalMyDsl.g:3108:2: rule__PathParam__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PathParam__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathParam__Group__2"


    // $ANTLR start "rule__PathParam__Group__2__Impl"
    // InternalMyDsl.g:3114:1: rule__PathParam__Group__2__Impl : ( '}' ) ;
    public final void rule__PathParam__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3118:1: ( ( '}' ) )
            // InternalMyDsl.g:3119:1: ( '}' )
            {
            // InternalMyDsl.g:3119:1: ( '}' )
            // InternalMyDsl.g:3120:2: '}'
            {
             before(grammarAccess.getPathParamAccess().getRightCurlyBracketKeyword_2()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getPathParamAccess().getRightCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathParam__Group__2__Impl"


    // $ANTLR start "rule__Response__Group__0"
    // InternalMyDsl.g:3130:1: rule__Response__Group__0 : rule__Response__Group__0__Impl rule__Response__Group__1 ;
    public final void rule__Response__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3134:1: ( rule__Response__Group__0__Impl rule__Response__Group__1 )
            // InternalMyDsl.g:3135:2: rule__Response__Group__0__Impl rule__Response__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Response__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Response__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group__0"


    // $ANTLR start "rule__Response__Group__0__Impl"
    // InternalMyDsl.g:3142:1: rule__Response__Group__0__Impl : ( 'Response' ) ;
    public final void rule__Response__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3146:1: ( ( 'Response' ) )
            // InternalMyDsl.g:3147:1: ( 'Response' )
            {
            // InternalMyDsl.g:3147:1: ( 'Response' )
            // InternalMyDsl.g:3148:2: 'Response'
            {
             before(grammarAccess.getResponseAccess().getResponseKeyword_0()); 
            match(input,56,FOLLOW_2); 
             after(grammarAccess.getResponseAccess().getResponseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group__0__Impl"


    // $ANTLR start "rule__Response__Group__1"
    // InternalMyDsl.g:3157:1: rule__Response__Group__1 : rule__Response__Group__1__Impl rule__Response__Group__2 ;
    public final void rule__Response__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3161:1: ( rule__Response__Group__1__Impl rule__Response__Group__2 )
            // InternalMyDsl.g:3162:2: rule__Response__Group__1__Impl rule__Response__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__Response__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Response__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group__1"


    // $ANTLR start "rule__Response__Group__1__Impl"
    // InternalMyDsl.g:3169:1: rule__Response__Group__1__Impl : ( '{' ) ;
    public final void rule__Response__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3173:1: ( ( '{' ) )
            // InternalMyDsl.g:3174:1: ( '{' )
            {
            // InternalMyDsl.g:3174:1: ( '{' )
            // InternalMyDsl.g:3175:2: '{'
            {
             before(grammarAccess.getResponseAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getResponseAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group__1__Impl"


    // $ANTLR start "rule__Response__Group__2"
    // InternalMyDsl.g:3184:1: rule__Response__Group__2 : rule__Response__Group__2__Impl rule__Response__Group__3 ;
    public final void rule__Response__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3188:1: ( rule__Response__Group__2__Impl rule__Response__Group__3 )
            // InternalMyDsl.g:3189:2: rule__Response__Group__2__Impl rule__Response__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Response__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Response__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group__2"


    // $ANTLR start "rule__Response__Group__2__Impl"
    // InternalMyDsl.g:3196:1: rule__Response__Group__2__Impl : ( 'Type' ) ;
    public final void rule__Response__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3200:1: ( ( 'Type' ) )
            // InternalMyDsl.g:3201:1: ( 'Type' )
            {
            // InternalMyDsl.g:3201:1: ( 'Type' )
            // InternalMyDsl.g:3202:2: 'Type'
            {
             before(grammarAccess.getResponseAccess().getTypeKeyword_2()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getResponseAccess().getTypeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group__2__Impl"


    // $ANTLR start "rule__Response__Group__3"
    // InternalMyDsl.g:3211:1: rule__Response__Group__3 : rule__Response__Group__3__Impl rule__Response__Group__4 ;
    public final void rule__Response__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3215:1: ( rule__Response__Group__3__Impl rule__Response__Group__4 )
            // InternalMyDsl.g:3216:2: rule__Response__Group__3__Impl rule__Response__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__Response__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Response__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group__3"


    // $ANTLR start "rule__Response__Group__3__Impl"
    // InternalMyDsl.g:3223:1: rule__Response__Group__3__Impl : ( RULE_EQUAL ) ;
    public final void rule__Response__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3227:1: ( ( RULE_EQUAL ) )
            // InternalMyDsl.g:3228:1: ( RULE_EQUAL )
            {
            // InternalMyDsl.g:3228:1: ( RULE_EQUAL )
            // InternalMyDsl.g:3229:2: RULE_EQUAL
            {
             before(grammarAccess.getResponseAccess().getEQUALTerminalRuleCall_3()); 
            match(input,RULE_EQUAL,FOLLOW_2); 
             after(grammarAccess.getResponseAccess().getEQUALTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group__3__Impl"


    // $ANTLR start "rule__Response__Group__4"
    // InternalMyDsl.g:3238:1: rule__Response__Group__4 : rule__Response__Group__4__Impl rule__Response__Group__5 ;
    public final void rule__Response__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3242:1: ( rule__Response__Group__4__Impl rule__Response__Group__5 )
            // InternalMyDsl.g:3243:2: rule__Response__Group__4__Impl rule__Response__Group__5
            {
            pushFollow(FOLLOW_30);
            rule__Response__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Response__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group__4"


    // $ANTLR start "rule__Response__Group__4__Impl"
    // InternalMyDsl.g:3250:1: rule__Response__Group__4__Impl : ( ( rule__Response__Alternatives_4 ) ) ;
    public final void rule__Response__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3254:1: ( ( ( rule__Response__Alternatives_4 ) ) )
            // InternalMyDsl.g:3255:1: ( ( rule__Response__Alternatives_4 ) )
            {
            // InternalMyDsl.g:3255:1: ( ( rule__Response__Alternatives_4 ) )
            // InternalMyDsl.g:3256:2: ( rule__Response__Alternatives_4 )
            {
             before(grammarAccess.getResponseAccess().getAlternatives_4()); 
            // InternalMyDsl.g:3257:2: ( rule__Response__Alternatives_4 )
            // InternalMyDsl.g:3257:3: rule__Response__Alternatives_4
            {
            pushFollow(FOLLOW_2);
            rule__Response__Alternatives_4();

            state._fsp--;


            }

             after(grammarAccess.getResponseAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group__4__Impl"


    // $ANTLR start "rule__Response__Group__5"
    // InternalMyDsl.g:3265:1: rule__Response__Group__5 : rule__Response__Group__5__Impl rule__Response__Group__6 ;
    public final void rule__Response__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3269:1: ( rule__Response__Group__5__Impl rule__Response__Group__6 )
            // InternalMyDsl.g:3270:2: rule__Response__Group__5__Impl rule__Response__Group__6
            {
            pushFollow(FOLLOW_30);
            rule__Response__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Response__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group__5"


    // $ANTLR start "rule__Response__Group__5__Impl"
    // InternalMyDsl.g:3277:1: rule__Response__Group__5__Impl : ( ( rule__Response__Group_5__0 )? ) ;
    public final void rule__Response__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3281:1: ( ( ( rule__Response__Group_5__0 )? ) )
            // InternalMyDsl.g:3282:1: ( ( rule__Response__Group_5__0 )? )
            {
            // InternalMyDsl.g:3282:1: ( ( rule__Response__Group_5__0 )? )
            // InternalMyDsl.g:3283:2: ( rule__Response__Group_5__0 )?
            {
             before(grammarAccess.getResponseAccess().getGroup_5()); 
            // InternalMyDsl.g:3284:2: ( rule__Response__Group_5__0 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==48) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMyDsl.g:3284:3: rule__Response__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Response__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getResponseAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group__5__Impl"


    // $ANTLR start "rule__Response__Group__6"
    // InternalMyDsl.g:3292:1: rule__Response__Group__6 : rule__Response__Group__6__Impl rule__Response__Group__7 ;
    public final void rule__Response__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3296:1: ( rule__Response__Group__6__Impl rule__Response__Group__7 )
            // InternalMyDsl.g:3297:2: rule__Response__Group__6__Impl rule__Response__Group__7
            {
            pushFollow(FOLLOW_24);
            rule__Response__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Response__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group__6"


    // $ANTLR start "rule__Response__Group__6__Impl"
    // InternalMyDsl.g:3304:1: rule__Response__Group__6__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Response__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3308:1: ( ( RULE_SEMICOLON ) )
            // InternalMyDsl.g:3309:1: ( RULE_SEMICOLON )
            {
            // InternalMyDsl.g:3309:1: ( RULE_SEMICOLON )
            // InternalMyDsl.g:3310:2: RULE_SEMICOLON
            {
             before(grammarAccess.getResponseAccess().getSEMICOLONTerminalRuleCall_6()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getResponseAccess().getSEMICOLONTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group__6__Impl"


    // $ANTLR start "rule__Response__Group__7"
    // InternalMyDsl.g:3319:1: rule__Response__Group__7 : rule__Response__Group__7__Impl ;
    public final void rule__Response__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3323:1: ( rule__Response__Group__7__Impl )
            // InternalMyDsl.g:3324:2: rule__Response__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Response__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group__7"


    // $ANTLR start "rule__Response__Group__7__Impl"
    // InternalMyDsl.g:3330:1: rule__Response__Group__7__Impl : ( '}' ) ;
    public final void rule__Response__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3334:1: ( ( '}' ) )
            // InternalMyDsl.g:3335:1: ( '}' )
            {
            // InternalMyDsl.g:3335:1: ( '}' )
            // InternalMyDsl.g:3336:2: '}'
            {
             before(grammarAccess.getResponseAccess().getRightCurlyBracketKeyword_7()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getResponseAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group__7__Impl"


    // $ANTLR start "rule__Response__Group_5__0"
    // InternalMyDsl.g:3346:1: rule__Response__Group_5__0 : rule__Response__Group_5__0__Impl rule__Response__Group_5__1 ;
    public final void rule__Response__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3350:1: ( rule__Response__Group_5__0__Impl rule__Response__Group_5__1 )
            // InternalMyDsl.g:3351:2: rule__Response__Group_5__0__Impl rule__Response__Group_5__1
            {
            pushFollow(FOLLOW_20);
            rule__Response__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Response__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group_5__0"


    // $ANTLR start "rule__Response__Group_5__0__Impl"
    // InternalMyDsl.g:3358:1: rule__Response__Group_5__0__Impl : ( '[' ) ;
    public final void rule__Response__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3362:1: ( ( '[' ) )
            // InternalMyDsl.g:3363:1: ( '[' )
            {
            // InternalMyDsl.g:3363:1: ( '[' )
            // InternalMyDsl.g:3364:2: '['
            {
             before(grammarAccess.getResponseAccess().getLeftSquareBracketKeyword_5_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getResponseAccess().getLeftSquareBracketKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group_5__0__Impl"


    // $ANTLR start "rule__Response__Group_5__1"
    // InternalMyDsl.g:3373:1: rule__Response__Group_5__1 : rule__Response__Group_5__1__Impl ;
    public final void rule__Response__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3377:1: ( rule__Response__Group_5__1__Impl )
            // InternalMyDsl.g:3378:2: rule__Response__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Response__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group_5__1"


    // $ANTLR start "rule__Response__Group_5__1__Impl"
    // InternalMyDsl.g:3384:1: rule__Response__Group_5__1__Impl : ( ']' ) ;
    public final void rule__Response__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3388:1: ( ( ']' ) )
            // InternalMyDsl.g:3389:1: ( ']' )
            {
            // InternalMyDsl.g:3389:1: ( ']' )
            // InternalMyDsl.g:3390:2: ']'
            {
             before(grammarAccess.getResponseAccess().getRightSquareBracketKeyword_5_1()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getResponseAccess().getRightSquareBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__Group_5__1__Impl"


    // $ANTLR start "rule__Request__Group__0"
    // InternalMyDsl.g:3400:1: rule__Request__Group__0 : rule__Request__Group__0__Impl rule__Request__Group__1 ;
    public final void rule__Request__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3404:1: ( rule__Request__Group__0__Impl rule__Request__Group__1 )
            // InternalMyDsl.g:3405:2: rule__Request__Group__0__Impl rule__Request__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Request__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Request__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group__0"


    // $ANTLR start "rule__Request__Group__0__Impl"
    // InternalMyDsl.g:3412:1: rule__Request__Group__0__Impl : ( 'Request' ) ;
    public final void rule__Request__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3416:1: ( ( 'Request' ) )
            // InternalMyDsl.g:3417:1: ( 'Request' )
            {
            // InternalMyDsl.g:3417:1: ( 'Request' )
            // InternalMyDsl.g:3418:2: 'Request'
            {
             before(grammarAccess.getRequestAccess().getRequestKeyword_0()); 
            match(input,58,FOLLOW_2); 
             after(grammarAccess.getRequestAccess().getRequestKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group__0__Impl"


    // $ANTLR start "rule__Request__Group__1"
    // InternalMyDsl.g:3427:1: rule__Request__Group__1 : rule__Request__Group__1__Impl rule__Request__Group__2 ;
    public final void rule__Request__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3431:1: ( rule__Request__Group__1__Impl rule__Request__Group__2 )
            // InternalMyDsl.g:3432:2: rule__Request__Group__1__Impl rule__Request__Group__2
            {
            pushFollow(FOLLOW_28);
            rule__Request__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Request__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group__1"


    // $ANTLR start "rule__Request__Group__1__Impl"
    // InternalMyDsl.g:3439:1: rule__Request__Group__1__Impl : ( '{' ) ;
    public final void rule__Request__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3443:1: ( ( '{' ) )
            // InternalMyDsl.g:3444:1: ( '{' )
            {
            // InternalMyDsl.g:3444:1: ( '{' )
            // InternalMyDsl.g:3445:2: '{'
            {
             before(grammarAccess.getRequestAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getRequestAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group__1__Impl"


    // $ANTLR start "rule__Request__Group__2"
    // InternalMyDsl.g:3454:1: rule__Request__Group__2 : rule__Request__Group__2__Impl rule__Request__Group__3 ;
    public final void rule__Request__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3458:1: ( rule__Request__Group__2__Impl rule__Request__Group__3 )
            // InternalMyDsl.g:3459:2: rule__Request__Group__2__Impl rule__Request__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Request__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Request__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group__2"


    // $ANTLR start "rule__Request__Group__2__Impl"
    // InternalMyDsl.g:3466:1: rule__Request__Group__2__Impl : ( 'Type' ) ;
    public final void rule__Request__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3470:1: ( ( 'Type' ) )
            // InternalMyDsl.g:3471:1: ( 'Type' )
            {
            // InternalMyDsl.g:3471:1: ( 'Type' )
            // InternalMyDsl.g:3472:2: 'Type'
            {
             before(grammarAccess.getRequestAccess().getTypeKeyword_2()); 
            match(input,57,FOLLOW_2); 
             after(grammarAccess.getRequestAccess().getTypeKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group__2__Impl"


    // $ANTLR start "rule__Request__Group__3"
    // InternalMyDsl.g:3481:1: rule__Request__Group__3 : rule__Request__Group__3__Impl rule__Request__Group__4 ;
    public final void rule__Request__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3485:1: ( rule__Request__Group__3__Impl rule__Request__Group__4 )
            // InternalMyDsl.g:3486:2: rule__Request__Group__3__Impl rule__Request__Group__4
            {
            pushFollow(FOLLOW_29);
            rule__Request__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Request__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group__3"


    // $ANTLR start "rule__Request__Group__3__Impl"
    // InternalMyDsl.g:3493:1: rule__Request__Group__3__Impl : ( RULE_EQUAL ) ;
    public final void rule__Request__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3497:1: ( ( RULE_EQUAL ) )
            // InternalMyDsl.g:3498:1: ( RULE_EQUAL )
            {
            // InternalMyDsl.g:3498:1: ( RULE_EQUAL )
            // InternalMyDsl.g:3499:2: RULE_EQUAL
            {
             before(grammarAccess.getRequestAccess().getEQUALTerminalRuleCall_3()); 
            match(input,RULE_EQUAL,FOLLOW_2); 
             after(grammarAccess.getRequestAccess().getEQUALTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group__3__Impl"


    // $ANTLR start "rule__Request__Group__4"
    // InternalMyDsl.g:3508:1: rule__Request__Group__4 : rule__Request__Group__4__Impl rule__Request__Group__5 ;
    public final void rule__Request__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3512:1: ( rule__Request__Group__4__Impl rule__Request__Group__5 )
            // InternalMyDsl.g:3513:2: rule__Request__Group__4__Impl rule__Request__Group__5
            {
            pushFollow(FOLLOW_30);
            rule__Request__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Request__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group__4"


    // $ANTLR start "rule__Request__Group__4__Impl"
    // InternalMyDsl.g:3520:1: rule__Request__Group__4__Impl : ( ( rule__Request__Alternatives_4 ) ) ;
    public final void rule__Request__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3524:1: ( ( ( rule__Request__Alternatives_4 ) ) )
            // InternalMyDsl.g:3525:1: ( ( rule__Request__Alternatives_4 ) )
            {
            // InternalMyDsl.g:3525:1: ( ( rule__Request__Alternatives_4 ) )
            // InternalMyDsl.g:3526:2: ( rule__Request__Alternatives_4 )
            {
             before(grammarAccess.getRequestAccess().getAlternatives_4()); 
            // InternalMyDsl.g:3527:2: ( rule__Request__Alternatives_4 )
            // InternalMyDsl.g:3527:3: rule__Request__Alternatives_4
            {
            pushFollow(FOLLOW_2);
            rule__Request__Alternatives_4();

            state._fsp--;


            }

             after(grammarAccess.getRequestAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group__4__Impl"


    // $ANTLR start "rule__Request__Group__5"
    // InternalMyDsl.g:3535:1: rule__Request__Group__5 : rule__Request__Group__5__Impl rule__Request__Group__6 ;
    public final void rule__Request__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3539:1: ( rule__Request__Group__5__Impl rule__Request__Group__6 )
            // InternalMyDsl.g:3540:2: rule__Request__Group__5__Impl rule__Request__Group__6
            {
            pushFollow(FOLLOW_30);
            rule__Request__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Request__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group__5"


    // $ANTLR start "rule__Request__Group__5__Impl"
    // InternalMyDsl.g:3547:1: rule__Request__Group__5__Impl : ( ( rule__Request__Group_5__0 )? ) ;
    public final void rule__Request__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3551:1: ( ( ( rule__Request__Group_5__0 )? ) )
            // InternalMyDsl.g:3552:1: ( ( rule__Request__Group_5__0 )? )
            {
            // InternalMyDsl.g:3552:1: ( ( rule__Request__Group_5__0 )? )
            // InternalMyDsl.g:3553:2: ( rule__Request__Group_5__0 )?
            {
             before(grammarAccess.getRequestAccess().getGroup_5()); 
            // InternalMyDsl.g:3554:2: ( rule__Request__Group_5__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==48) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMyDsl.g:3554:3: rule__Request__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Request__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getRequestAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group__5__Impl"


    // $ANTLR start "rule__Request__Group__6"
    // InternalMyDsl.g:3562:1: rule__Request__Group__6 : rule__Request__Group__6__Impl rule__Request__Group__7 ;
    public final void rule__Request__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3566:1: ( rule__Request__Group__6__Impl rule__Request__Group__7 )
            // InternalMyDsl.g:3567:2: rule__Request__Group__6__Impl rule__Request__Group__7
            {
            pushFollow(FOLLOW_24);
            rule__Request__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Request__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group__6"


    // $ANTLR start "rule__Request__Group__6__Impl"
    // InternalMyDsl.g:3574:1: rule__Request__Group__6__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Request__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3578:1: ( ( RULE_SEMICOLON ) )
            // InternalMyDsl.g:3579:1: ( RULE_SEMICOLON )
            {
            // InternalMyDsl.g:3579:1: ( RULE_SEMICOLON )
            // InternalMyDsl.g:3580:2: RULE_SEMICOLON
            {
             before(grammarAccess.getRequestAccess().getSEMICOLONTerminalRuleCall_6()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getRequestAccess().getSEMICOLONTerminalRuleCall_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group__6__Impl"


    // $ANTLR start "rule__Request__Group__7"
    // InternalMyDsl.g:3589:1: rule__Request__Group__7 : rule__Request__Group__7__Impl ;
    public final void rule__Request__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3593:1: ( rule__Request__Group__7__Impl )
            // InternalMyDsl.g:3594:2: rule__Request__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Request__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group__7"


    // $ANTLR start "rule__Request__Group__7__Impl"
    // InternalMyDsl.g:3600:1: rule__Request__Group__7__Impl : ( '}' ) ;
    public final void rule__Request__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3604:1: ( ( '}' ) )
            // InternalMyDsl.g:3605:1: ( '}' )
            {
            // InternalMyDsl.g:3605:1: ( '}' )
            // InternalMyDsl.g:3606:2: '}'
            {
             before(grammarAccess.getRequestAccess().getRightCurlyBracketKeyword_7()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getRequestAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group__7__Impl"


    // $ANTLR start "rule__Request__Group_5__0"
    // InternalMyDsl.g:3616:1: rule__Request__Group_5__0 : rule__Request__Group_5__0__Impl rule__Request__Group_5__1 ;
    public final void rule__Request__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3620:1: ( rule__Request__Group_5__0__Impl rule__Request__Group_5__1 )
            // InternalMyDsl.g:3621:2: rule__Request__Group_5__0__Impl rule__Request__Group_5__1
            {
            pushFollow(FOLLOW_20);
            rule__Request__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Request__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group_5__0"


    // $ANTLR start "rule__Request__Group_5__0__Impl"
    // InternalMyDsl.g:3628:1: rule__Request__Group_5__0__Impl : ( '[' ) ;
    public final void rule__Request__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3632:1: ( ( '[' ) )
            // InternalMyDsl.g:3633:1: ( '[' )
            {
            // InternalMyDsl.g:3633:1: ( '[' )
            // InternalMyDsl.g:3634:2: '['
            {
             before(grammarAccess.getRequestAccess().getLeftSquareBracketKeyword_5_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getRequestAccess().getLeftSquareBracketKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group_5__0__Impl"


    // $ANTLR start "rule__Request__Group_5__1"
    // InternalMyDsl.g:3643:1: rule__Request__Group_5__1 : rule__Request__Group_5__1__Impl ;
    public final void rule__Request__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3647:1: ( rule__Request__Group_5__1__Impl )
            // InternalMyDsl.g:3648:2: rule__Request__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Request__Group_5__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group_5__1"


    // $ANTLR start "rule__Request__Group_5__1__Impl"
    // InternalMyDsl.g:3654:1: rule__Request__Group_5__1__Impl : ( ']' ) ;
    public final void rule__Request__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3658:1: ( ( ']' ) )
            // InternalMyDsl.g:3659:1: ( ']' )
            {
            // InternalMyDsl.g:3659:1: ( ']' )
            // InternalMyDsl.g:3660:2: ']'
            {
             before(grammarAccess.getRequestAccess().getRightSquareBracketKeyword_5_1()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getRequestAccess().getRightSquareBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__Group_5__1__Impl"


    // $ANTLR start "rule__Test__Group__0"
    // InternalMyDsl.g:3670:1: rule__Test__Group__0 : rule__Test__Group__0__Impl rule__Test__Group__1 ;
    public final void rule__Test__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3674:1: ( rule__Test__Group__0__Impl rule__Test__Group__1 )
            // InternalMyDsl.g:3675:2: rule__Test__Group__0__Impl rule__Test__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__Test__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__0"


    // $ANTLR start "rule__Test__Group__0__Impl"
    // InternalMyDsl.g:3682:1: rule__Test__Group__0__Impl : ( () ) ;
    public final void rule__Test__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3686:1: ( ( () ) )
            // InternalMyDsl.g:3687:1: ( () )
            {
            // InternalMyDsl.g:3687:1: ( () )
            // InternalMyDsl.g:3688:2: ()
            {
             before(grammarAccess.getTestAccess().getTestAction_0()); 
            // InternalMyDsl.g:3689:2: ()
            // InternalMyDsl.g:3689:3: 
            {
            }

             after(grammarAccess.getTestAccess().getTestAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__0__Impl"


    // $ANTLR start "rule__Test__Group__1"
    // InternalMyDsl.g:3697:1: rule__Test__Group__1 : rule__Test__Group__1__Impl rule__Test__Group__2 ;
    public final void rule__Test__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3701:1: ( rule__Test__Group__1__Impl rule__Test__Group__2 )
            // InternalMyDsl.g:3702:2: rule__Test__Group__1__Impl rule__Test__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Test__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__1"


    // $ANTLR start "rule__Test__Group__1__Impl"
    // InternalMyDsl.g:3709:1: rule__Test__Group__1__Impl : ( 'Test' ) ;
    public final void rule__Test__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3713:1: ( ( 'Test' ) )
            // InternalMyDsl.g:3714:1: ( 'Test' )
            {
            // InternalMyDsl.g:3714:1: ( 'Test' )
            // InternalMyDsl.g:3715:2: 'Test'
            {
             before(grammarAccess.getTestAccess().getTestKeyword_1()); 
            match(input,59,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getTestKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__1__Impl"


    // $ANTLR start "rule__Test__Group__2"
    // InternalMyDsl.g:3724:1: rule__Test__Group__2 : rule__Test__Group__2__Impl rule__Test__Group__3 ;
    public final void rule__Test__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3728:1: ( rule__Test__Group__2__Impl rule__Test__Group__3 )
            // InternalMyDsl.g:3729:2: rule__Test__Group__2__Impl rule__Test__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__Test__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__2"


    // $ANTLR start "rule__Test__Group__2__Impl"
    // InternalMyDsl.g:3736:1: rule__Test__Group__2__Impl : ( RULE_ID ) ;
    public final void rule__Test__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3740:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3741:1: ( RULE_ID )
            {
            // InternalMyDsl.g:3741:1: ( RULE_ID )
            // InternalMyDsl.g:3742:2: RULE_ID
            {
             before(grammarAccess.getTestAccess().getIDTerminalRuleCall_2()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getIDTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__2__Impl"


    // $ANTLR start "rule__Test__Group__3"
    // InternalMyDsl.g:3751:1: rule__Test__Group__3 : rule__Test__Group__3__Impl rule__Test__Group__4 ;
    public final void rule__Test__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3755:1: ( rule__Test__Group__3__Impl rule__Test__Group__4 )
            // InternalMyDsl.g:3756:2: rule__Test__Group__3__Impl rule__Test__Group__4
            {
            pushFollow(FOLLOW_32);
            rule__Test__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__3"


    // $ANTLR start "rule__Test__Group__3__Impl"
    // InternalMyDsl.g:3763:1: rule__Test__Group__3__Impl : ( '{' ) ;
    public final void rule__Test__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3767:1: ( ( '{' ) )
            // InternalMyDsl.g:3768:1: ( '{' )
            {
            // InternalMyDsl.g:3768:1: ( '{' )
            // InternalMyDsl.g:3769:2: '{'
            {
             before(grammarAccess.getTestAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getLeftCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__3__Impl"


    // $ANTLR start "rule__Test__Group__4"
    // InternalMyDsl.g:3778:1: rule__Test__Group__4 : rule__Test__Group__4__Impl rule__Test__Group__5 ;
    public final void rule__Test__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3782:1: ( rule__Test__Group__4__Impl rule__Test__Group__5 )
            // InternalMyDsl.g:3783:2: rule__Test__Group__4__Impl rule__Test__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Test__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__4"


    // $ANTLR start "rule__Test__Group__4__Impl"
    // InternalMyDsl.g:3790:1: rule__Test__Group__4__Impl : ( 'service' ) ;
    public final void rule__Test__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3794:1: ( ( 'service' ) )
            // InternalMyDsl.g:3795:1: ( 'service' )
            {
            // InternalMyDsl.g:3795:1: ( 'service' )
            // InternalMyDsl.g:3796:2: 'service'
            {
             before(grammarAccess.getTestAccess().getServiceKeyword_4()); 
            match(input,60,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getServiceKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__4__Impl"


    // $ANTLR start "rule__Test__Group__5"
    // InternalMyDsl.g:3805:1: rule__Test__Group__5 : rule__Test__Group__5__Impl rule__Test__Group__6 ;
    public final void rule__Test__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3809:1: ( rule__Test__Group__5__Impl rule__Test__Group__6 )
            // InternalMyDsl.g:3810:2: rule__Test__Group__5__Impl rule__Test__Group__6
            {
            pushFollow(FOLLOW_12);
            rule__Test__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__5"


    // $ANTLR start "rule__Test__Group__5__Impl"
    // InternalMyDsl.g:3817:1: rule__Test__Group__5__Impl : ( RULE_EQUAL ) ;
    public final void rule__Test__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3821:1: ( ( RULE_EQUAL ) )
            // InternalMyDsl.g:3822:1: ( RULE_EQUAL )
            {
            // InternalMyDsl.g:3822:1: ( RULE_EQUAL )
            // InternalMyDsl.g:3823:2: RULE_EQUAL
            {
             before(grammarAccess.getTestAccess().getEQUALTerminalRuleCall_5()); 
            match(input,RULE_EQUAL,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getEQUALTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__5__Impl"


    // $ANTLR start "rule__Test__Group__6"
    // InternalMyDsl.g:3832:1: rule__Test__Group__6 : rule__Test__Group__6__Impl rule__Test__Group__7 ;
    public final void rule__Test__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3836:1: ( rule__Test__Group__6__Impl rule__Test__Group__7 )
            // InternalMyDsl.g:3837:2: rule__Test__Group__6__Impl rule__Test__Group__7
            {
            pushFollow(FOLLOW_6);
            rule__Test__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__6"


    // $ANTLR start "rule__Test__Group__6__Impl"
    // InternalMyDsl.g:3844:1: rule__Test__Group__6__Impl : ( ( rule__Test__ServiceAssignment_6 ) ) ;
    public final void rule__Test__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3848:1: ( ( ( rule__Test__ServiceAssignment_6 ) ) )
            // InternalMyDsl.g:3849:1: ( ( rule__Test__ServiceAssignment_6 ) )
            {
            // InternalMyDsl.g:3849:1: ( ( rule__Test__ServiceAssignment_6 ) )
            // InternalMyDsl.g:3850:2: ( rule__Test__ServiceAssignment_6 )
            {
             before(grammarAccess.getTestAccess().getServiceAssignment_6()); 
            // InternalMyDsl.g:3851:2: ( rule__Test__ServiceAssignment_6 )
            // InternalMyDsl.g:3851:3: rule__Test__ServiceAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Test__ServiceAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getServiceAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__6__Impl"


    // $ANTLR start "rule__Test__Group__7"
    // InternalMyDsl.g:3859:1: rule__Test__Group__7 : rule__Test__Group__7__Impl rule__Test__Group__8 ;
    public final void rule__Test__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3863:1: ( rule__Test__Group__7__Impl rule__Test__Group__8 )
            // InternalMyDsl.g:3864:2: rule__Test__Group__7__Impl rule__Test__Group__8
            {
            pushFollow(FOLLOW_33);
            rule__Test__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__7"


    // $ANTLR start "rule__Test__Group__7__Impl"
    // InternalMyDsl.g:3871:1: rule__Test__Group__7__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Test__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3875:1: ( ( RULE_SEMICOLON ) )
            // InternalMyDsl.g:3876:1: ( RULE_SEMICOLON )
            {
            // InternalMyDsl.g:3876:1: ( RULE_SEMICOLON )
            // InternalMyDsl.g:3877:2: RULE_SEMICOLON
            {
             before(grammarAccess.getTestAccess().getSEMICOLONTerminalRuleCall_7()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getSEMICOLONTerminalRuleCall_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__7__Impl"


    // $ANTLR start "rule__Test__Group__8"
    // InternalMyDsl.g:3886:1: rule__Test__Group__8 : rule__Test__Group__8__Impl rule__Test__Group__9 ;
    public final void rule__Test__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3890:1: ( rule__Test__Group__8__Impl rule__Test__Group__9 )
            // InternalMyDsl.g:3891:2: rule__Test__Group__8__Impl rule__Test__Group__9
            {
            pushFollow(FOLLOW_4);
            rule__Test__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__8"


    // $ANTLR start "rule__Test__Group__8__Impl"
    // InternalMyDsl.g:3898:1: rule__Test__Group__8__Impl : ( 'description' ) ;
    public final void rule__Test__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3902:1: ( ( 'description' ) )
            // InternalMyDsl.g:3903:1: ( 'description' )
            {
            // InternalMyDsl.g:3903:1: ( 'description' )
            // InternalMyDsl.g:3904:2: 'description'
            {
             before(grammarAccess.getTestAccess().getDescriptionKeyword_8()); 
            match(input,61,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getDescriptionKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__8__Impl"


    // $ANTLR start "rule__Test__Group__9"
    // InternalMyDsl.g:3913:1: rule__Test__Group__9 : rule__Test__Group__9__Impl rule__Test__Group__10 ;
    public final void rule__Test__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3917:1: ( rule__Test__Group__9__Impl rule__Test__Group__10 )
            // InternalMyDsl.g:3918:2: rule__Test__Group__9__Impl rule__Test__Group__10
            {
            pushFollow(FOLLOW_5);
            rule__Test__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__9"


    // $ANTLR start "rule__Test__Group__9__Impl"
    // InternalMyDsl.g:3925:1: rule__Test__Group__9__Impl : ( RULE_EQUAL ) ;
    public final void rule__Test__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3929:1: ( ( RULE_EQUAL ) )
            // InternalMyDsl.g:3930:1: ( RULE_EQUAL )
            {
            // InternalMyDsl.g:3930:1: ( RULE_EQUAL )
            // InternalMyDsl.g:3931:2: RULE_EQUAL
            {
             before(grammarAccess.getTestAccess().getEQUALTerminalRuleCall_9()); 
            match(input,RULE_EQUAL,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getEQUALTerminalRuleCall_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__9__Impl"


    // $ANTLR start "rule__Test__Group__10"
    // InternalMyDsl.g:3940:1: rule__Test__Group__10 : rule__Test__Group__10__Impl rule__Test__Group__11 ;
    public final void rule__Test__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3944:1: ( rule__Test__Group__10__Impl rule__Test__Group__11 )
            // InternalMyDsl.g:3945:2: rule__Test__Group__10__Impl rule__Test__Group__11
            {
            pushFollow(FOLLOW_6);
            rule__Test__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__10"


    // $ANTLR start "rule__Test__Group__10__Impl"
    // InternalMyDsl.g:3952:1: rule__Test__Group__10__Impl : ( ( rule__Test__DescripcionAssignment_10 ) ) ;
    public final void rule__Test__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3956:1: ( ( ( rule__Test__DescripcionAssignment_10 ) ) )
            // InternalMyDsl.g:3957:1: ( ( rule__Test__DescripcionAssignment_10 ) )
            {
            // InternalMyDsl.g:3957:1: ( ( rule__Test__DescripcionAssignment_10 ) )
            // InternalMyDsl.g:3958:2: ( rule__Test__DescripcionAssignment_10 )
            {
             before(grammarAccess.getTestAccess().getDescripcionAssignment_10()); 
            // InternalMyDsl.g:3959:2: ( rule__Test__DescripcionAssignment_10 )
            // InternalMyDsl.g:3959:3: rule__Test__DescripcionAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__Test__DescripcionAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getTestAccess().getDescripcionAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__10__Impl"


    // $ANTLR start "rule__Test__Group__11"
    // InternalMyDsl.g:3967:1: rule__Test__Group__11 : rule__Test__Group__11__Impl rule__Test__Group__12 ;
    public final void rule__Test__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3971:1: ( rule__Test__Group__11__Impl rule__Test__Group__12 )
            // InternalMyDsl.g:3972:2: rule__Test__Group__11__Impl rule__Test__Group__12
            {
            pushFollow(FOLLOW_34);
            rule__Test__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__11"


    // $ANTLR start "rule__Test__Group__11__Impl"
    // InternalMyDsl.g:3979:1: rule__Test__Group__11__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Test__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3983:1: ( ( RULE_SEMICOLON ) )
            // InternalMyDsl.g:3984:1: ( RULE_SEMICOLON )
            {
            // InternalMyDsl.g:3984:1: ( RULE_SEMICOLON )
            // InternalMyDsl.g:3985:2: RULE_SEMICOLON
            {
             before(grammarAccess.getTestAccess().getSEMICOLONTerminalRuleCall_11()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getSEMICOLONTerminalRuleCall_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__11__Impl"


    // $ANTLR start "rule__Test__Group__12"
    // InternalMyDsl.g:3994:1: rule__Test__Group__12 : rule__Test__Group__12__Impl rule__Test__Group__13 ;
    public final void rule__Test__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3998:1: ( rule__Test__Group__12__Impl rule__Test__Group__13 )
            // InternalMyDsl.g:3999:2: rule__Test__Group__12__Impl rule__Test__Group__13
            {
            pushFollow(FOLLOW_34);
            rule__Test__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__12"


    // $ANTLR start "rule__Test__Group__12__Impl"
    // InternalMyDsl.g:4006:1: rule__Test__Group__12__Impl : ( ( rule__Test__Group_12__0 )? ) ;
    public final void rule__Test__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4010:1: ( ( ( rule__Test__Group_12__0 )? ) )
            // InternalMyDsl.g:4011:1: ( ( rule__Test__Group_12__0 )? )
            {
            // InternalMyDsl.g:4011:1: ( ( rule__Test__Group_12__0 )? )
            // InternalMyDsl.g:4012:2: ( rule__Test__Group_12__0 )?
            {
             before(grammarAccess.getTestAccess().getGroup_12()); 
            // InternalMyDsl.g:4013:2: ( rule__Test__Group_12__0 )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==63) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMyDsl.g:4013:3: rule__Test__Group_12__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Test__Group_12__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTestAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__12__Impl"


    // $ANTLR start "rule__Test__Group__13"
    // InternalMyDsl.g:4021:1: rule__Test__Group__13 : rule__Test__Group__13__Impl rule__Test__Group__14 ;
    public final void rule__Test__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4025:1: ( rule__Test__Group__13__Impl rule__Test__Group__14 )
            // InternalMyDsl.g:4026:2: rule__Test__Group__13__Impl rule__Test__Group__14
            {
            pushFollow(FOLLOW_13);
            rule__Test__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__13"


    // $ANTLR start "rule__Test__Group__13__Impl"
    // InternalMyDsl.g:4033:1: rule__Test__Group__13__Impl : ( 'Assertions' ) ;
    public final void rule__Test__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4037:1: ( ( 'Assertions' ) )
            // InternalMyDsl.g:4038:1: ( 'Assertions' )
            {
            // InternalMyDsl.g:4038:1: ( 'Assertions' )
            // InternalMyDsl.g:4039:2: 'Assertions'
            {
             before(grammarAccess.getTestAccess().getAssertionsKeyword_13()); 
            match(input,62,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getAssertionsKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__13__Impl"


    // $ANTLR start "rule__Test__Group__14"
    // InternalMyDsl.g:4048:1: rule__Test__Group__14 : rule__Test__Group__14__Impl rule__Test__Group__15 ;
    public final void rule__Test__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4052:1: ( rule__Test__Group__14__Impl rule__Test__Group__15 )
            // InternalMyDsl.g:4053:2: rule__Test__Group__14__Impl rule__Test__Group__15
            {
            pushFollow(FOLLOW_35);
            rule__Test__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__14"


    // $ANTLR start "rule__Test__Group__14__Impl"
    // InternalMyDsl.g:4060:1: rule__Test__Group__14__Impl : ( '{' ) ;
    public final void rule__Test__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4064:1: ( ( '{' ) )
            // InternalMyDsl.g:4065:1: ( '{' )
            {
            // InternalMyDsl.g:4065:1: ( '{' )
            // InternalMyDsl.g:4066:2: '{'
            {
             before(grammarAccess.getTestAccess().getLeftCurlyBracketKeyword_14()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getLeftCurlyBracketKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__14__Impl"


    // $ANTLR start "rule__Test__Group__15"
    // InternalMyDsl.g:4075:1: rule__Test__Group__15 : rule__Test__Group__15__Impl rule__Test__Group__16 ;
    public final void rule__Test__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4079:1: ( rule__Test__Group__15__Impl rule__Test__Group__16 )
            // InternalMyDsl.g:4080:2: rule__Test__Group__15__Impl rule__Test__Group__16
            {
            pushFollow(FOLLOW_35);
            rule__Test__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__15"


    // $ANTLR start "rule__Test__Group__15__Impl"
    // InternalMyDsl.g:4087:1: rule__Test__Group__15__Impl : ( ( rule__Test__AsertionsAssignment_15 )* ) ;
    public final void rule__Test__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4091:1: ( ( ( rule__Test__AsertionsAssignment_15 )* ) )
            // InternalMyDsl.g:4092:1: ( ( rule__Test__AsertionsAssignment_15 )* )
            {
            // InternalMyDsl.g:4092:1: ( ( rule__Test__AsertionsAssignment_15 )* )
            // InternalMyDsl.g:4093:2: ( rule__Test__AsertionsAssignment_15 )*
            {
             before(grammarAccess.getTestAccess().getAsertionsAssignment_15()); 
            // InternalMyDsl.g:4094:2: ( rule__Test__AsertionsAssignment_15 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==68||(LA30_0>=72 && LA30_0<=73)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalMyDsl.g:4094:3: rule__Test__AsertionsAssignment_15
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__Test__AsertionsAssignment_15();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getTestAccess().getAsertionsAssignment_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__15__Impl"


    // $ANTLR start "rule__Test__Group__16"
    // InternalMyDsl.g:4102:1: rule__Test__Group__16 : rule__Test__Group__16__Impl rule__Test__Group__17 ;
    public final void rule__Test__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4106:1: ( rule__Test__Group__16__Impl rule__Test__Group__17 )
            // InternalMyDsl.g:4107:2: rule__Test__Group__16__Impl rule__Test__Group__17
            {
            pushFollow(FOLLOW_24);
            rule__Test__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__16"


    // $ANTLR start "rule__Test__Group__16__Impl"
    // InternalMyDsl.g:4114:1: rule__Test__Group__16__Impl : ( '}' ) ;
    public final void rule__Test__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4118:1: ( ( '}' ) )
            // InternalMyDsl.g:4119:1: ( '}' )
            {
            // InternalMyDsl.g:4119:1: ( '}' )
            // InternalMyDsl.g:4120:2: '}'
            {
             before(grammarAccess.getTestAccess().getRightCurlyBracketKeyword_16()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getRightCurlyBracketKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__16__Impl"


    // $ANTLR start "rule__Test__Group__17"
    // InternalMyDsl.g:4129:1: rule__Test__Group__17 : rule__Test__Group__17__Impl ;
    public final void rule__Test__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4133:1: ( rule__Test__Group__17__Impl )
            // InternalMyDsl.g:4134:2: rule__Test__Group__17__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Test__Group__17__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__17"


    // $ANTLR start "rule__Test__Group__17__Impl"
    // InternalMyDsl.g:4140:1: rule__Test__Group__17__Impl : ( '}' ) ;
    public final void rule__Test__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4144:1: ( ( '}' ) )
            // InternalMyDsl.g:4145:1: ( '}' )
            {
            // InternalMyDsl.g:4145:1: ( '}' )
            // InternalMyDsl.g:4146:2: '}'
            {
             before(grammarAccess.getTestAccess().getRightCurlyBracketKeyword_17()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getRightCurlyBracketKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group__17__Impl"


    // $ANTLR start "rule__Test__Group_12__0"
    // InternalMyDsl.g:4156:1: rule__Test__Group_12__0 : rule__Test__Group_12__0__Impl rule__Test__Group_12__1 ;
    public final void rule__Test__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4160:1: ( rule__Test__Group_12__0__Impl rule__Test__Group_12__1 )
            // InternalMyDsl.g:4161:2: rule__Test__Group_12__0__Impl rule__Test__Group_12__1
            {
            pushFollow(FOLLOW_19);
            rule__Test__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_12__0"


    // $ANTLR start "rule__Test__Group_12__0__Impl"
    // InternalMyDsl.g:4168:1: rule__Test__Group_12__0__Impl : ( 'Mapping' ) ;
    public final void rule__Test__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4172:1: ( ( 'Mapping' ) )
            // InternalMyDsl.g:4173:1: ( 'Mapping' )
            {
            // InternalMyDsl.g:4173:1: ( 'Mapping' )
            // InternalMyDsl.g:4174:2: 'Mapping'
            {
             before(grammarAccess.getTestAccess().getMappingKeyword_12_0()); 
            match(input,63,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getMappingKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_12__0__Impl"


    // $ANTLR start "rule__Test__Group_12__1"
    // InternalMyDsl.g:4183:1: rule__Test__Group_12__1 : rule__Test__Group_12__1__Impl rule__Test__Group_12__2 ;
    public final void rule__Test__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4187:1: ( rule__Test__Group_12__1__Impl rule__Test__Group_12__2 )
            // InternalMyDsl.g:4188:2: rule__Test__Group_12__1__Impl rule__Test__Group_12__2
            {
            pushFollow(FOLLOW_37);
            rule__Test__Group_12__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group_12__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_12__1"


    // $ANTLR start "rule__Test__Group_12__1__Impl"
    // InternalMyDsl.g:4195:1: rule__Test__Group_12__1__Impl : ( '[' ) ;
    public final void rule__Test__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4199:1: ( ( '[' ) )
            // InternalMyDsl.g:4200:1: ( '[' )
            {
            // InternalMyDsl.g:4200:1: ( '[' )
            // InternalMyDsl.g:4201:2: '['
            {
             before(grammarAccess.getTestAccess().getLeftSquareBracketKeyword_12_1()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getLeftSquareBracketKeyword_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_12__1__Impl"


    // $ANTLR start "rule__Test__Group_12__2"
    // InternalMyDsl.g:4210:1: rule__Test__Group_12__2 : rule__Test__Group_12__2__Impl rule__Test__Group_12__3 ;
    public final void rule__Test__Group_12__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4214:1: ( rule__Test__Group_12__2__Impl rule__Test__Group_12__3 )
            // InternalMyDsl.g:4215:2: rule__Test__Group_12__2__Impl rule__Test__Group_12__3
            {
            pushFollow(FOLLOW_37);
            rule__Test__Group_12__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Test__Group_12__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_12__2"


    // $ANTLR start "rule__Test__Group_12__2__Impl"
    // InternalMyDsl.g:4222:1: rule__Test__Group_12__2__Impl : ( ( rule__Test__MappingsAssignment_12_2 )* ) ;
    public final void rule__Test__Group_12__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4226:1: ( ( ( rule__Test__MappingsAssignment_12_2 )* ) )
            // InternalMyDsl.g:4227:1: ( ( rule__Test__MappingsAssignment_12_2 )* )
            {
            // InternalMyDsl.g:4227:1: ( ( rule__Test__MappingsAssignment_12_2 )* )
            // InternalMyDsl.g:4228:2: ( rule__Test__MappingsAssignment_12_2 )*
            {
             before(grammarAccess.getTestAccess().getMappingsAssignment_12_2()); 
            // InternalMyDsl.g:4229:2: ( rule__Test__MappingsAssignment_12_2 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==64) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalMyDsl.g:4229:3: rule__Test__MappingsAssignment_12_2
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__Test__MappingsAssignment_12_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

             after(grammarAccess.getTestAccess().getMappingsAssignment_12_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_12__2__Impl"


    // $ANTLR start "rule__Test__Group_12__3"
    // InternalMyDsl.g:4237:1: rule__Test__Group_12__3 : rule__Test__Group_12__3__Impl ;
    public final void rule__Test__Group_12__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4241:1: ( rule__Test__Group_12__3__Impl )
            // InternalMyDsl.g:4242:2: rule__Test__Group_12__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Test__Group_12__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_12__3"


    // $ANTLR start "rule__Test__Group_12__3__Impl"
    // InternalMyDsl.g:4248:1: rule__Test__Group_12__3__Impl : ( ']' ) ;
    public final void rule__Test__Group_12__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4252:1: ( ( ']' ) )
            // InternalMyDsl.g:4253:1: ( ']' )
            {
            // InternalMyDsl.g:4253:1: ( ']' )
            // InternalMyDsl.g:4254:2: ']'
            {
             before(grammarAccess.getTestAccess().getRightSquareBracketKeyword_12_3()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getRightSquareBracketKeyword_12_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__Group_12__3__Impl"


    // $ANTLR start "rule__Mapping__Group__0"
    // InternalMyDsl.g:4264:1: rule__Mapping__Group__0 : rule__Mapping__Group__0__Impl rule__Mapping__Group__1 ;
    public final void rule__Mapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4268:1: ( rule__Mapping__Group__0__Impl rule__Mapping__Group__1 )
            // InternalMyDsl.g:4269:2: rule__Mapping__Group__0__Impl rule__Mapping__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Mapping__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapping__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__0"


    // $ANTLR start "rule__Mapping__Group__0__Impl"
    // InternalMyDsl.g:4276:1: rule__Mapping__Group__0__Impl : ( '{parameter' ) ;
    public final void rule__Mapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4280:1: ( ( '{parameter' ) )
            // InternalMyDsl.g:4281:1: ( '{parameter' )
            {
            // InternalMyDsl.g:4281:1: ( '{parameter' )
            // InternalMyDsl.g:4282:2: '{parameter'
            {
             before(grammarAccess.getMappingAccess().getParameterKeyword_0()); 
            match(input,64,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getParameterKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__0__Impl"


    // $ANTLR start "rule__Mapping__Group__1"
    // InternalMyDsl.g:4291:1: rule__Mapping__Group__1 : rule__Mapping__Group__1__Impl rule__Mapping__Group__2 ;
    public final void rule__Mapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4295:1: ( rule__Mapping__Group__1__Impl rule__Mapping__Group__2 )
            // InternalMyDsl.g:4296:2: rule__Mapping__Group__1__Impl rule__Mapping__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__Mapping__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapping__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__1"


    // $ANTLR start "rule__Mapping__Group__1__Impl"
    // InternalMyDsl.g:4303:1: rule__Mapping__Group__1__Impl : ( RULE_EQUAL ) ;
    public final void rule__Mapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4307:1: ( ( RULE_EQUAL ) )
            // InternalMyDsl.g:4308:1: ( RULE_EQUAL )
            {
            // InternalMyDsl.g:4308:1: ( RULE_EQUAL )
            // InternalMyDsl.g:4309:2: RULE_EQUAL
            {
             before(grammarAccess.getMappingAccess().getEQUALTerminalRuleCall_1()); 
            match(input,RULE_EQUAL,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getEQUALTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__1__Impl"


    // $ANTLR start "rule__Mapping__Group__2"
    // InternalMyDsl.g:4318:1: rule__Mapping__Group__2 : rule__Mapping__Group__2__Impl rule__Mapping__Group__3 ;
    public final void rule__Mapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4322:1: ( rule__Mapping__Group__2__Impl rule__Mapping__Group__3 )
            // InternalMyDsl.g:4323:2: rule__Mapping__Group__2__Impl rule__Mapping__Group__3
            {
            pushFollow(FOLLOW_39);
            rule__Mapping__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapping__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__2"


    // $ANTLR start "rule__Mapping__Group__2__Impl"
    // InternalMyDsl.g:4330:1: rule__Mapping__Group__2__Impl : ( ( rule__Mapping__ParametroAssignment_2 ) ) ;
    public final void rule__Mapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4334:1: ( ( ( rule__Mapping__ParametroAssignment_2 ) ) )
            // InternalMyDsl.g:4335:1: ( ( rule__Mapping__ParametroAssignment_2 ) )
            {
            // InternalMyDsl.g:4335:1: ( ( rule__Mapping__ParametroAssignment_2 ) )
            // InternalMyDsl.g:4336:2: ( rule__Mapping__ParametroAssignment_2 )
            {
             before(grammarAccess.getMappingAccess().getParametroAssignment_2()); 
            // InternalMyDsl.g:4337:2: ( rule__Mapping__ParametroAssignment_2 )
            // InternalMyDsl.g:4337:3: rule__Mapping__ParametroAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Mapping__ParametroAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getParametroAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__2__Impl"


    // $ANTLR start "rule__Mapping__Group__3"
    // InternalMyDsl.g:4345:1: rule__Mapping__Group__3 : rule__Mapping__Group__3__Impl rule__Mapping__Group__4 ;
    public final void rule__Mapping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4349:1: ( rule__Mapping__Group__3__Impl rule__Mapping__Group__4 )
            // InternalMyDsl.g:4350:2: rule__Mapping__Group__3__Impl rule__Mapping__Group__4
            {
            pushFollow(FOLLOW_40);
            rule__Mapping__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapping__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__3"


    // $ANTLR start "rule__Mapping__Group__3__Impl"
    // InternalMyDsl.g:4357:1: rule__Mapping__Group__3__Impl : ( ',' ) ;
    public final void rule__Mapping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4361:1: ( ( ',' ) )
            // InternalMyDsl.g:4362:1: ( ',' )
            {
            // InternalMyDsl.g:4362:1: ( ',' )
            // InternalMyDsl.g:4363:2: ','
            {
             before(grammarAccess.getMappingAccess().getCommaKeyword_3()); 
            match(input,65,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__3__Impl"


    // $ANTLR start "rule__Mapping__Group__4"
    // InternalMyDsl.g:4372:1: rule__Mapping__Group__4 : rule__Mapping__Group__4__Impl rule__Mapping__Group__5 ;
    public final void rule__Mapping__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4376:1: ( rule__Mapping__Group__4__Impl rule__Mapping__Group__5 )
            // InternalMyDsl.g:4377:2: rule__Mapping__Group__4__Impl rule__Mapping__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Mapping__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapping__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__4"


    // $ANTLR start "rule__Mapping__Group__4__Impl"
    // InternalMyDsl.g:4384:1: rule__Mapping__Group__4__Impl : ( 'value' ) ;
    public final void rule__Mapping__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4388:1: ( ( 'value' ) )
            // InternalMyDsl.g:4389:1: ( 'value' )
            {
            // InternalMyDsl.g:4389:1: ( 'value' )
            // InternalMyDsl.g:4390:2: 'value'
            {
             before(grammarAccess.getMappingAccess().getValueKeyword_4()); 
            match(input,66,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getValueKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__4__Impl"


    // $ANTLR start "rule__Mapping__Group__5"
    // InternalMyDsl.g:4399:1: rule__Mapping__Group__5 : rule__Mapping__Group__5__Impl rule__Mapping__Group__6 ;
    public final void rule__Mapping__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4403:1: ( rule__Mapping__Group__5__Impl rule__Mapping__Group__6 )
            // InternalMyDsl.g:4404:2: rule__Mapping__Group__5__Impl rule__Mapping__Group__6
            {
            pushFollow(FOLLOW_41);
            rule__Mapping__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapping__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__5"


    // $ANTLR start "rule__Mapping__Group__5__Impl"
    // InternalMyDsl.g:4411:1: rule__Mapping__Group__5__Impl : ( RULE_EQUAL ) ;
    public final void rule__Mapping__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4415:1: ( ( RULE_EQUAL ) )
            // InternalMyDsl.g:4416:1: ( RULE_EQUAL )
            {
            // InternalMyDsl.g:4416:1: ( RULE_EQUAL )
            // InternalMyDsl.g:4417:2: RULE_EQUAL
            {
             before(grammarAccess.getMappingAccess().getEQUALTerminalRuleCall_5()); 
            match(input,RULE_EQUAL,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getEQUALTerminalRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__5__Impl"


    // $ANTLR start "rule__Mapping__Group__6"
    // InternalMyDsl.g:4426:1: rule__Mapping__Group__6 : rule__Mapping__Group__6__Impl rule__Mapping__Group__7 ;
    public final void rule__Mapping__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4430:1: ( rule__Mapping__Group__6__Impl rule__Mapping__Group__7 )
            // InternalMyDsl.g:4431:2: rule__Mapping__Group__6__Impl rule__Mapping__Group__7
            {
            pushFollow(FOLLOW_24);
            rule__Mapping__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapping__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__6"


    // $ANTLR start "rule__Mapping__Group__6__Impl"
    // InternalMyDsl.g:4438:1: rule__Mapping__Group__6__Impl : ( ( rule__Mapping__Alternatives_6 ) ) ;
    public final void rule__Mapping__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4442:1: ( ( ( rule__Mapping__Alternatives_6 ) ) )
            // InternalMyDsl.g:4443:1: ( ( rule__Mapping__Alternatives_6 ) )
            {
            // InternalMyDsl.g:4443:1: ( ( rule__Mapping__Alternatives_6 ) )
            // InternalMyDsl.g:4444:2: ( rule__Mapping__Alternatives_6 )
            {
             before(grammarAccess.getMappingAccess().getAlternatives_6()); 
            // InternalMyDsl.g:4445:2: ( rule__Mapping__Alternatives_6 )
            // InternalMyDsl.g:4445:3: rule__Mapping__Alternatives_6
            {
            pushFollow(FOLLOW_2);
            rule__Mapping__Alternatives_6();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getAlternatives_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__6__Impl"


    // $ANTLR start "rule__Mapping__Group__7"
    // InternalMyDsl.g:4453:1: rule__Mapping__Group__7 : rule__Mapping__Group__7__Impl ;
    public final void rule__Mapping__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4457:1: ( rule__Mapping__Group__7__Impl )
            // InternalMyDsl.g:4458:2: rule__Mapping__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mapping__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__7"


    // $ANTLR start "rule__Mapping__Group__7__Impl"
    // InternalMyDsl.g:4464:1: rule__Mapping__Group__7__Impl : ( '}' ) ;
    public final void rule__Mapping__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4468:1: ( ( '}' ) )
            // InternalMyDsl.g:4469:1: ( '}' )
            {
            // InternalMyDsl.g:4469:1: ( '}' )
            // InternalMyDsl.g:4470:2: '}'
            {
             before(grammarAccess.getMappingAccess().getRightCurlyBracketKeyword_7()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group__7__Impl"


    // $ANTLR start "rule__Mapping__Group_6_0__0"
    // InternalMyDsl.g:4480:1: rule__Mapping__Group_6_0__0 : rule__Mapping__Group_6_0__0__Impl rule__Mapping__Group_6_0__1 ;
    public final void rule__Mapping__Group_6_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4484:1: ( rule__Mapping__Group_6_0__0__Impl rule__Mapping__Group_6_0__1 )
            // InternalMyDsl.g:4485:2: rule__Mapping__Group_6_0__0__Impl rule__Mapping__Group_6_0__1
            {
            pushFollow(FOLLOW_12);
            rule__Mapping__Group_6_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Mapping__Group_6_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group_6_0__0"


    // $ANTLR start "rule__Mapping__Group_6_0__0__Impl"
    // InternalMyDsl.g:4492:1: rule__Mapping__Group_6_0__0__Impl : ( 'request->' ) ;
    public final void rule__Mapping__Group_6_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4496:1: ( ( 'request->' ) )
            // InternalMyDsl.g:4497:1: ( 'request->' )
            {
            // InternalMyDsl.g:4497:1: ( 'request->' )
            // InternalMyDsl.g:4498:2: 'request->'
            {
             before(grammarAccess.getMappingAccess().getRequestKeyword_6_0_0()); 
            match(input,67,FOLLOW_2); 
             after(grammarAccess.getMappingAccess().getRequestKeyword_6_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group_6_0__0__Impl"


    // $ANTLR start "rule__Mapping__Group_6_0__1"
    // InternalMyDsl.g:4507:1: rule__Mapping__Group_6_0__1 : rule__Mapping__Group_6_0__1__Impl ;
    public final void rule__Mapping__Group_6_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4511:1: ( rule__Mapping__Group_6_0__1__Impl )
            // InternalMyDsl.g:4512:2: rule__Mapping__Group_6_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Mapping__Group_6_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group_6_0__1"


    // $ANTLR start "rule__Mapping__Group_6_0__1__Impl"
    // InternalMyDsl.g:4518:1: rule__Mapping__Group_6_0__1__Impl : ( ( rule__Mapping__AtributoAssignment_6_0_1 ) ) ;
    public final void rule__Mapping__Group_6_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4522:1: ( ( ( rule__Mapping__AtributoAssignment_6_0_1 ) ) )
            // InternalMyDsl.g:4523:1: ( ( rule__Mapping__AtributoAssignment_6_0_1 ) )
            {
            // InternalMyDsl.g:4523:1: ( ( rule__Mapping__AtributoAssignment_6_0_1 ) )
            // InternalMyDsl.g:4524:2: ( rule__Mapping__AtributoAssignment_6_0_1 )
            {
             before(grammarAccess.getMappingAccess().getAtributoAssignment_6_0_1()); 
            // InternalMyDsl.g:4525:2: ( rule__Mapping__AtributoAssignment_6_0_1 )
            // InternalMyDsl.g:4525:3: rule__Mapping__AtributoAssignment_6_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Mapping__AtributoAssignment_6_0_1();

            state._fsp--;


            }

             after(grammarAccess.getMappingAccess().getAtributoAssignment_6_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__Group_6_0__1__Impl"


    // $ANTLR start "rule__Asercion__Group__0"
    // InternalMyDsl.g:4534:1: rule__Asercion__Group__0 : rule__Asercion__Group__0__Impl rule__Asercion__Group__1 ;
    public final void rule__Asercion__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4538:1: ( rule__Asercion__Group__0__Impl rule__Asercion__Group__1 )
            // InternalMyDsl.g:4539:2: rule__Asercion__Group__0__Impl rule__Asercion__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__Asercion__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Asercion__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Group__0"


    // $ANTLR start "rule__Asercion__Group__0__Impl"
    // InternalMyDsl.g:4546:1: rule__Asercion__Group__0__Impl : ( ( rule__Asercion__Alternatives_0 ) ) ;
    public final void rule__Asercion__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4550:1: ( ( ( rule__Asercion__Alternatives_0 ) ) )
            // InternalMyDsl.g:4551:1: ( ( rule__Asercion__Alternatives_0 ) )
            {
            // InternalMyDsl.g:4551:1: ( ( rule__Asercion__Alternatives_0 ) )
            // InternalMyDsl.g:4552:2: ( rule__Asercion__Alternatives_0 )
            {
             before(grammarAccess.getAsercionAccess().getAlternatives_0()); 
            // InternalMyDsl.g:4553:2: ( rule__Asercion__Alternatives_0 )
            // InternalMyDsl.g:4553:3: rule__Asercion__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Asercion__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getAsercionAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Group__0__Impl"


    // $ANTLR start "rule__Asercion__Group__1"
    // InternalMyDsl.g:4561:1: rule__Asercion__Group__1 : rule__Asercion__Group__1__Impl rule__Asercion__Group__2 ;
    public final void rule__Asercion__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4565:1: ( rule__Asercion__Group__1__Impl rule__Asercion__Group__2 )
            // InternalMyDsl.g:4566:2: rule__Asercion__Group__1__Impl rule__Asercion__Group__2
            {
            pushFollow(FOLLOW_43);
            rule__Asercion__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Asercion__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Group__1"


    // $ANTLR start "rule__Asercion__Group__1__Impl"
    // InternalMyDsl.g:4573:1: rule__Asercion__Group__1__Impl : ( ( rule__Asercion__OperadorAssignment_1 ) ) ;
    public final void rule__Asercion__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4577:1: ( ( ( rule__Asercion__OperadorAssignment_1 ) ) )
            // InternalMyDsl.g:4578:1: ( ( rule__Asercion__OperadorAssignment_1 ) )
            {
            // InternalMyDsl.g:4578:1: ( ( rule__Asercion__OperadorAssignment_1 ) )
            // InternalMyDsl.g:4579:2: ( rule__Asercion__OperadorAssignment_1 )
            {
             before(grammarAccess.getAsercionAccess().getOperadorAssignment_1()); 
            // InternalMyDsl.g:4580:2: ( rule__Asercion__OperadorAssignment_1 )
            // InternalMyDsl.g:4580:3: rule__Asercion__OperadorAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Asercion__OperadorAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAsercionAccess().getOperadorAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Group__1__Impl"


    // $ANTLR start "rule__Asercion__Group__2"
    // InternalMyDsl.g:4588:1: rule__Asercion__Group__2 : rule__Asercion__Group__2__Impl rule__Asercion__Group__3 ;
    public final void rule__Asercion__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4592:1: ( rule__Asercion__Group__2__Impl rule__Asercion__Group__3 )
            // InternalMyDsl.g:4593:2: rule__Asercion__Group__2__Impl rule__Asercion__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Asercion__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Asercion__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Group__2"


    // $ANTLR start "rule__Asercion__Group__2__Impl"
    // InternalMyDsl.g:4600:1: rule__Asercion__Group__2__Impl : ( ( rule__Asercion__Alternatives_2 ) ) ;
    public final void rule__Asercion__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4604:1: ( ( ( rule__Asercion__Alternatives_2 ) ) )
            // InternalMyDsl.g:4605:1: ( ( rule__Asercion__Alternatives_2 ) )
            {
            // InternalMyDsl.g:4605:1: ( ( rule__Asercion__Alternatives_2 ) )
            // InternalMyDsl.g:4606:2: ( rule__Asercion__Alternatives_2 )
            {
             before(grammarAccess.getAsercionAccess().getAlternatives_2()); 
            // InternalMyDsl.g:4607:2: ( rule__Asercion__Alternatives_2 )
            // InternalMyDsl.g:4607:3: rule__Asercion__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__Asercion__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getAsercionAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Group__2__Impl"


    // $ANTLR start "rule__Asercion__Group__3"
    // InternalMyDsl.g:4615:1: rule__Asercion__Group__3 : rule__Asercion__Group__3__Impl ;
    public final void rule__Asercion__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4619:1: ( rule__Asercion__Group__3__Impl )
            // InternalMyDsl.g:4620:2: rule__Asercion__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Asercion__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Group__3"


    // $ANTLR start "rule__Asercion__Group__3__Impl"
    // InternalMyDsl.g:4626:1: rule__Asercion__Group__3__Impl : ( RULE_SEMICOLON ) ;
    public final void rule__Asercion__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4630:1: ( ( RULE_SEMICOLON ) )
            // InternalMyDsl.g:4631:1: ( RULE_SEMICOLON )
            {
            // InternalMyDsl.g:4631:1: ( RULE_SEMICOLON )
            // InternalMyDsl.g:4632:2: RULE_SEMICOLON
            {
             before(grammarAccess.getAsercionAccess().getSEMICOLONTerminalRuleCall_3()); 
            match(input,RULE_SEMICOLON,FOLLOW_2); 
             after(grammarAccess.getAsercionAccess().getSEMICOLONTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Group__3__Impl"


    // $ANTLR start "rule__Asercion__Group_0_2__0"
    // InternalMyDsl.g:4642:1: rule__Asercion__Group_0_2__0 : rule__Asercion__Group_0_2__0__Impl rule__Asercion__Group_0_2__1 ;
    public final void rule__Asercion__Group_0_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4646:1: ( rule__Asercion__Group_0_2__0__Impl rule__Asercion__Group_0_2__1 )
            // InternalMyDsl.g:4647:2: rule__Asercion__Group_0_2__0__Impl rule__Asercion__Group_0_2__1
            {
            pushFollow(FOLLOW_12);
            rule__Asercion__Group_0_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Asercion__Group_0_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Group_0_2__0"


    // $ANTLR start "rule__Asercion__Group_0_2__0__Impl"
    // InternalMyDsl.g:4654:1: rule__Asercion__Group_0_2__0__Impl : ( 'response->' ) ;
    public final void rule__Asercion__Group_0_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4658:1: ( ( 'response->' ) )
            // InternalMyDsl.g:4659:1: ( 'response->' )
            {
            // InternalMyDsl.g:4659:1: ( 'response->' )
            // InternalMyDsl.g:4660:2: 'response->'
            {
             before(grammarAccess.getAsercionAccess().getResponseKeyword_0_2_0()); 
            match(input,68,FOLLOW_2); 
             after(grammarAccess.getAsercionAccess().getResponseKeyword_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Group_0_2__0__Impl"


    // $ANTLR start "rule__Asercion__Group_0_2__1"
    // InternalMyDsl.g:4669:1: rule__Asercion__Group_0_2__1 : rule__Asercion__Group_0_2__1__Impl ;
    public final void rule__Asercion__Group_0_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4673:1: ( rule__Asercion__Group_0_2__1__Impl )
            // InternalMyDsl.g:4674:2: rule__Asercion__Group_0_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Asercion__Group_0_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Group_0_2__1"


    // $ANTLR start "rule__Asercion__Group_0_2__1__Impl"
    // InternalMyDsl.g:4680:1: rule__Asercion__Group_0_2__1__Impl : ( ( rule__Asercion__Elemento1Assignment_0_2_1 ) ) ;
    public final void rule__Asercion__Group_0_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4684:1: ( ( ( rule__Asercion__Elemento1Assignment_0_2_1 ) ) )
            // InternalMyDsl.g:4685:1: ( ( rule__Asercion__Elemento1Assignment_0_2_1 ) )
            {
            // InternalMyDsl.g:4685:1: ( ( rule__Asercion__Elemento1Assignment_0_2_1 ) )
            // InternalMyDsl.g:4686:2: ( rule__Asercion__Elemento1Assignment_0_2_1 )
            {
             before(grammarAccess.getAsercionAccess().getElemento1Assignment_0_2_1()); 
            // InternalMyDsl.g:4687:2: ( rule__Asercion__Elemento1Assignment_0_2_1 )
            // InternalMyDsl.g:4687:3: rule__Asercion__Elemento1Assignment_0_2_1
            {
            pushFollow(FOLLOW_2);
            rule__Asercion__Elemento1Assignment_0_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAsercionAccess().getElemento1Assignment_0_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Group_0_2__1__Impl"


    // $ANTLR start "rule__Asercion__Group_2_1__0"
    // InternalMyDsl.g:4696:1: rule__Asercion__Group_2_1__0 : rule__Asercion__Group_2_1__0__Impl rule__Asercion__Group_2_1__1 ;
    public final void rule__Asercion__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4700:1: ( rule__Asercion__Group_2_1__0__Impl rule__Asercion__Group_2_1__1 )
            // InternalMyDsl.g:4701:2: rule__Asercion__Group_2_1__0__Impl rule__Asercion__Group_2_1__1
            {
            pushFollow(FOLLOW_12);
            rule__Asercion__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Asercion__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Group_2_1__0"


    // $ANTLR start "rule__Asercion__Group_2_1__0__Impl"
    // InternalMyDsl.g:4708:1: rule__Asercion__Group_2_1__0__Impl : ( 'parameter.' ) ;
    public final void rule__Asercion__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4712:1: ( ( 'parameter.' ) )
            // InternalMyDsl.g:4713:1: ( 'parameter.' )
            {
            // InternalMyDsl.g:4713:1: ( 'parameter.' )
            // InternalMyDsl.g:4714:2: 'parameter.'
            {
             before(grammarAccess.getAsercionAccess().getParameterKeyword_2_1_0()); 
            match(input,69,FOLLOW_2); 
             after(grammarAccess.getAsercionAccess().getParameterKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Group_2_1__0__Impl"


    // $ANTLR start "rule__Asercion__Group_2_1__1"
    // InternalMyDsl.g:4723:1: rule__Asercion__Group_2_1__1 : rule__Asercion__Group_2_1__1__Impl ;
    public final void rule__Asercion__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4727:1: ( rule__Asercion__Group_2_1__1__Impl )
            // InternalMyDsl.g:4728:2: rule__Asercion__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Asercion__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Group_2_1__1"


    // $ANTLR start "rule__Asercion__Group_2_1__1__Impl"
    // InternalMyDsl.g:4734:1: rule__Asercion__Group_2_1__1__Impl : ( ( rule__Asercion__Elemento2Assignment_2_1_1 ) ) ;
    public final void rule__Asercion__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4738:1: ( ( ( rule__Asercion__Elemento2Assignment_2_1_1 ) ) )
            // InternalMyDsl.g:4739:1: ( ( rule__Asercion__Elemento2Assignment_2_1_1 ) )
            {
            // InternalMyDsl.g:4739:1: ( ( rule__Asercion__Elemento2Assignment_2_1_1 ) )
            // InternalMyDsl.g:4740:2: ( rule__Asercion__Elemento2Assignment_2_1_1 )
            {
             before(grammarAccess.getAsercionAccess().getElemento2Assignment_2_1_1()); 
            // InternalMyDsl.g:4741:2: ( rule__Asercion__Elemento2Assignment_2_1_1 )
            // InternalMyDsl.g:4741:3: rule__Asercion__Elemento2Assignment_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Asercion__Elemento2Assignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAsercionAccess().getElemento2Assignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Group_2_1__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalMyDsl.g:4750:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4754:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalMyDsl.g:4755:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_44);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalMyDsl.g:4762:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4766:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4767:1: ( RULE_ID )
            {
            // InternalMyDsl.g:4767:1: ( RULE_ID )
            // InternalMyDsl.g:4768:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalMyDsl.g:4777:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4781:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalMyDsl.g:4782:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalMyDsl.g:4788:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4792:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalMyDsl.g:4793:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalMyDsl.g:4793:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalMyDsl.g:4794:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalMyDsl.g:4795:2: ( rule__QualifiedName__Group_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==70) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalMyDsl.g:4795:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_45);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalMyDsl.g:4804:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4808:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalMyDsl.g:4809:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_12);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalMyDsl.g:4816:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4820:1: ( ( '.' ) )
            // InternalMyDsl.g:4821:1: ( '.' )
            {
            // InternalMyDsl.g:4821:1: ( '.' )
            // InternalMyDsl.g:4822:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,70,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalMyDsl.g:4831:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4835:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalMyDsl.g:4836:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalMyDsl.g:4842:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4846:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4847:1: ( RULE_ID )
            {
            // InternalMyDsl.g:4847:1: ( RULE_ID )
            // InternalMyDsl.g:4848:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Api__UrlAssignment_3"
    // InternalMyDsl.g:4858:1: rule__Api__UrlAssignment_3 : ( ruleEString ) ;
    public final void rule__Api__UrlAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4862:1: ( ( ruleEString ) )
            // InternalMyDsl.g:4863:2: ( ruleEString )
            {
            // InternalMyDsl.g:4863:2: ( ruleEString )
            // InternalMyDsl.g:4864:3: ruleEString
            {
             before(grammarAccess.getApiAccess().getUrlEStringParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getApiAccess().getUrlEStringParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__UrlAssignment_3"


    // $ANTLR start "rule__Api__EntidadesAssignment_5"
    // InternalMyDsl.g:4873:1: rule__Api__EntidadesAssignment_5 : ( ruleEntidad ) ;
    public final void rule__Api__EntidadesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4877:1: ( ( ruleEntidad ) )
            // InternalMyDsl.g:4878:2: ( ruleEntidad )
            {
            // InternalMyDsl.g:4878:2: ( ruleEntidad )
            // InternalMyDsl.g:4879:3: ruleEntidad
            {
             before(grammarAccess.getApiAccess().getEntidadesEntidadParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleEntidad();

            state._fsp--;

             after(grammarAccess.getApiAccess().getEntidadesEntidadParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__EntidadesAssignment_5"


    // $ANTLR start "rule__Api__PrimitivetypesAssignment_6"
    // InternalMyDsl.g:4888:1: rule__Api__PrimitivetypesAssignment_6 : ( rulePrimitiveType ) ;
    public final void rule__Api__PrimitivetypesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4892:1: ( ( rulePrimitiveType ) )
            // InternalMyDsl.g:4893:2: ( rulePrimitiveType )
            {
            // InternalMyDsl.g:4893:2: ( rulePrimitiveType )
            // InternalMyDsl.g:4894:3: rulePrimitiveType
            {
             before(grammarAccess.getApiAccess().getPrimitivetypesPrimitiveTypeParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            rulePrimitiveType();

            state._fsp--;

             after(grammarAccess.getApiAccess().getPrimitivetypesPrimitiveTypeParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__PrimitivetypesAssignment_6"


    // $ANTLR start "rule__Api__ServiciosRestAssignment_7"
    // InternalMyDsl.g:4903:1: rule__Api__ServiciosRestAssignment_7 : ( ruleServicioRest ) ;
    public final void rule__Api__ServiciosRestAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4907:1: ( ( ruleServicioRest ) )
            // InternalMyDsl.g:4908:2: ( ruleServicioRest )
            {
            // InternalMyDsl.g:4908:2: ( ruleServicioRest )
            // InternalMyDsl.g:4909:3: ruleServicioRest
            {
             before(grammarAccess.getApiAccess().getServiciosRestServicioRestParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleServicioRest();

            state._fsp--;

             after(grammarAccess.getApiAccess().getServiciosRestServicioRestParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__ServiciosRestAssignment_7"


    // $ANTLR start "rule__Api__TestsAssignment_8"
    // InternalMyDsl.g:4918:1: rule__Api__TestsAssignment_8 : ( ruleTest ) ;
    public final void rule__Api__TestsAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4922:1: ( ( ruleTest ) )
            // InternalMyDsl.g:4923:2: ( ruleTest )
            {
            // InternalMyDsl.g:4923:2: ( ruleTest )
            // InternalMyDsl.g:4924:3: ruleTest
            {
             before(grammarAccess.getApiAccess().getTestsTestParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleTest();

            state._fsp--;

             after(grammarAccess.getApiAccess().getTestsTestParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Api__TestsAssignment_8"


    // $ANTLR start "rule__SimpleEntity__NameAssignment_1"
    // InternalMyDsl.g:4933:1: rule__SimpleEntity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__SimpleEntity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4937:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4938:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4938:2: ( RULE_ID )
            // InternalMyDsl.g:4939:3: RULE_ID
            {
             before(grammarAccess.getSimpleEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSimpleEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__NameAssignment_1"


    // $ANTLR start "rule__SimpleEntity__AtributosAssignment_3"
    // InternalMyDsl.g:4948:1: rule__SimpleEntity__AtributosAssignment_3 : ( ruleAtributoSimple ) ;
    public final void rule__SimpleEntity__AtributosAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4952:1: ( ( ruleAtributoSimple ) )
            // InternalMyDsl.g:4953:2: ( ruleAtributoSimple )
            {
            // InternalMyDsl.g:4953:2: ( ruleAtributoSimple )
            // InternalMyDsl.g:4954:3: ruleAtributoSimple
            {
             before(grammarAccess.getSimpleEntityAccess().getAtributosAtributoSimpleParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAtributoSimple();

            state._fsp--;

             after(grammarAccess.getSimpleEntityAccess().getAtributosAtributoSimpleParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SimpleEntity__AtributosAssignment_3"


    // $ANTLR start "rule__AtributoMocka__TipoAssignment_0"
    // InternalMyDsl.g:4963:1: rule__AtributoMocka__TipoAssignment_0 : ( ruleTipoAtributo ) ;
    public final void rule__AtributoMocka__TipoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4967:1: ( ( ruleTipoAtributo ) )
            // InternalMyDsl.g:4968:2: ( ruleTipoAtributo )
            {
            // InternalMyDsl.g:4968:2: ( ruleTipoAtributo )
            // InternalMyDsl.g:4969:3: ruleTipoAtributo
            {
             before(grammarAccess.getAtributoMockaAccess().getTipoTipoAtributoEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTipoAtributo();

            state._fsp--;

             after(grammarAccess.getAtributoMockaAccess().getTipoTipoAtributoEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__TipoAssignment_0"


    // $ANTLR start "rule__AtributoMocka__NameAssignment_1"
    // InternalMyDsl.g:4978:1: rule__AtributoMocka__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AtributoMocka__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4982:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:4983:2: ( RULE_ID )
            {
            // InternalMyDsl.g:4983:2: ( RULE_ID )
            // InternalMyDsl.g:4984:3: RULE_ID
            {
             before(grammarAccess.getAtributoMockaAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAtributoMockaAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__NameAssignment_1"


    // $ANTLR start "rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0"
    // InternalMyDsl.g:4993:1: rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0 : ( ( 'PK,mockType' ) ) ;
    public final void rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4997:1: ( ( ( 'PK,mockType' ) ) )
            // InternalMyDsl.g:4998:2: ( ( 'PK,mockType' ) )
            {
            // InternalMyDsl.g:4998:2: ( ( 'PK,mockType' ) )
            // InternalMyDsl.g:4999:3: ( 'PK,mockType' )
            {
             before(grammarAccess.getAtributoMockaAccess().getPrimaryKeyPKMockTypeKeyword_2_1_0_0_0()); 
            // InternalMyDsl.g:5000:3: ( 'PK,mockType' )
            // InternalMyDsl.g:5001:4: 'PK,mockType'
            {
             before(grammarAccess.getAtributoMockaAccess().getPrimaryKeyPKMockTypeKeyword_2_1_0_0_0()); 
            match(input,71,FOLLOW_2); 
             after(grammarAccess.getAtributoMockaAccess().getPrimaryKeyPKMockTypeKeyword_2_1_0_0_0()); 

            }

             after(grammarAccess.getAtributoMockaAccess().getPrimaryKeyPKMockTypeKeyword_2_1_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__PrimaryKeyAssignment_2_1_0_0"


    // $ANTLR start "rule__AtributoMocka__MockTypeAssignment_2_1_0_2"
    // InternalMyDsl.g:5012:1: rule__AtributoMocka__MockTypeAssignment_2_1_0_2 : ( ruleMockaroo ) ;
    public final void rule__AtributoMocka__MockTypeAssignment_2_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5016:1: ( ( ruleMockaroo ) )
            // InternalMyDsl.g:5017:2: ( ruleMockaroo )
            {
            // InternalMyDsl.g:5017:2: ( ruleMockaroo )
            // InternalMyDsl.g:5018:3: ruleMockaroo
            {
             before(grammarAccess.getAtributoMockaAccess().getMockTypeMockarooEnumRuleCall_2_1_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMockaroo();

            state._fsp--;

             after(grammarAccess.getAtributoMockaAccess().getMockTypeMockarooEnumRuleCall_2_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__MockTypeAssignment_2_1_0_2"


    // $ANTLR start "rule__AtributoMocka__MockTypeAssignment_2_1_1_2"
    // InternalMyDsl.g:5027:1: rule__AtributoMocka__MockTypeAssignment_2_1_1_2 : ( ruleMockaroo ) ;
    public final void rule__AtributoMocka__MockTypeAssignment_2_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5031:1: ( ( ruleMockaroo ) )
            // InternalMyDsl.g:5032:2: ( ruleMockaroo )
            {
            // InternalMyDsl.g:5032:2: ( ruleMockaroo )
            // InternalMyDsl.g:5033:3: ruleMockaroo
            {
             before(grammarAccess.getAtributoMockaAccess().getMockTypeMockarooEnumRuleCall_2_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMockaroo();

            state._fsp--;

             after(grammarAccess.getAtributoMockaAccess().getMockTypeMockarooEnumRuleCall_2_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoMocka__MockTypeAssignment_2_1_1_2"


    // $ANTLR start "rule__AtributoArreglo__TipoAssignment_0"
    // InternalMyDsl.g:5042:1: rule__AtributoArreglo__TipoAssignment_0 : ( ruleTipoAtributo ) ;
    public final void rule__AtributoArreglo__TipoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5046:1: ( ( ruleTipoAtributo ) )
            // InternalMyDsl.g:5047:2: ( ruleTipoAtributo )
            {
            // InternalMyDsl.g:5047:2: ( ruleTipoAtributo )
            // InternalMyDsl.g:5048:3: ruleTipoAtributo
            {
             before(grammarAccess.getAtributoArregloAccess().getTipoTipoAtributoEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTipoAtributo();

            state._fsp--;

             after(grammarAccess.getAtributoArregloAccess().getTipoTipoAtributoEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoArreglo__TipoAssignment_0"


    // $ANTLR start "rule__AtributoArreglo__NameAssignment_3"
    // InternalMyDsl.g:5057:1: rule__AtributoArreglo__NameAssignment_3 : ( RULE_ID ) ;
    public final void rule__AtributoArreglo__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5061:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5062:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5062:2: ( RULE_ID )
            // InternalMyDsl.g:5063:3: RULE_ID
            {
             before(grammarAccess.getAtributoArregloAccess().getNameIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAtributoArregloAccess().getNameIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoArreglo__NameAssignment_3"


    // $ANTLR start "rule__AtributoSimple__TipoAssignment_0"
    // InternalMyDsl.g:5072:1: rule__AtributoSimple__TipoAssignment_0 : ( ruleTipoAtributo ) ;
    public final void rule__AtributoSimple__TipoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5076:1: ( ( ruleTipoAtributo ) )
            // InternalMyDsl.g:5077:2: ( ruleTipoAtributo )
            {
            // InternalMyDsl.g:5077:2: ( ruleTipoAtributo )
            // InternalMyDsl.g:5078:3: ruleTipoAtributo
            {
             before(grammarAccess.getAtributoSimpleAccess().getTipoTipoAtributoEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTipoAtributo();

            state._fsp--;

             after(grammarAccess.getAtributoSimpleAccess().getTipoTipoAtributoEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoSimple__TipoAssignment_0"


    // $ANTLR start "rule__AtributoSimple__NameAssignment_1"
    // InternalMyDsl.g:5087:1: rule__AtributoSimple__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__AtributoSimple__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5091:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5092:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5092:2: ( RULE_ID )
            // InternalMyDsl.g:5093:3: RULE_ID
            {
             before(grammarAccess.getAtributoSimpleAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAtributoSimpleAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AtributoSimple__NameAssignment_1"


    // $ANTLR start "rule__MyString__NameAssignment"
    // InternalMyDsl.g:5102:1: rule__MyString__NameAssignment : ( ruleEString ) ;
    public final void rule__MyString__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5106:1: ( ( ruleEString ) )
            // InternalMyDsl.g:5107:2: ( ruleEString )
            {
            // InternalMyDsl.g:5107:2: ( ruleEString )
            // InternalMyDsl.g:5108:3: ruleEString
            {
             before(grammarAccess.getMyStringAccess().getNameEStringParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getMyStringAccess().getNameEStringParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyString__NameAssignment"


    // $ANTLR start "rule__MyNumeric__NameAssignment"
    // InternalMyDsl.g:5117:1: rule__MyNumeric__NameAssignment : ( ruleEInt ) ;
    public final void rule__MyNumeric__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5121:1: ( ( ruleEInt ) )
            // InternalMyDsl.g:5122:2: ( ruleEInt )
            {
            // InternalMyDsl.g:5122:2: ( ruleEInt )
            // InternalMyDsl.g:5123:3: ruleEInt
            {
             before(grammarAccess.getMyNumericAccess().getNameEIntParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEInt();

            state._fsp--;

             after(grammarAccess.getMyNumericAccess().getNameEIntParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyNumeric__NameAssignment"


    // $ANTLR start "rule__MyBoolean__NameAssignment"
    // InternalMyDsl.g:5132:1: rule__MyBoolean__NameAssignment : ( ruleEBoolean ) ;
    public final void rule__MyBoolean__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5136:1: ( ( ruleEBoolean ) )
            // InternalMyDsl.g:5137:2: ( ruleEBoolean )
            {
            // InternalMyDsl.g:5137:2: ( ruleEBoolean )
            // InternalMyDsl.g:5138:3: ruleEBoolean
            {
             before(grammarAccess.getMyBooleanAccess().getNameEBooleanParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleEBoolean();

            state._fsp--;

             after(grammarAccess.getMyBooleanAccess().getNameEBooleanParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MyBoolean__NameAssignment"


    // $ANTLR start "rule__MockarooEntity__NameAssignment_1"
    // InternalMyDsl.g:5147:1: rule__MockarooEntity__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MockarooEntity__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5151:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5152:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5152:2: ( RULE_ID )
            // InternalMyDsl.g:5153:3: RULE_ID
            {
             before(grammarAccess.getMockarooEntityAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMockarooEntityAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MockarooEntity__NameAssignment_1"


    // $ANTLR start "rule__MockarooEntity__AtributosAssignment_3"
    // InternalMyDsl.g:5162:1: rule__MockarooEntity__AtributosAssignment_3 : ( ruleAtributo ) ;
    public final void rule__MockarooEntity__AtributosAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5166:1: ( ( ruleAtributo ) )
            // InternalMyDsl.g:5167:2: ( ruleAtributo )
            {
            // InternalMyDsl.g:5167:2: ( ruleAtributo )
            // InternalMyDsl.g:5168:3: ruleAtributo
            {
             before(grammarAccess.getMockarooEntityAccess().getAtributosAtributoParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAtributo();

            state._fsp--;

             after(grammarAccess.getMockarooEntityAccess().getAtributosAtributoParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MockarooEntity__AtributosAssignment_3"


    // $ANTLR start "rule__ServicioRest__MetodoAssignment_0"
    // InternalMyDsl.g:5177:1: rule__ServicioRest__MetodoAssignment_0 : ( ruleTipoMetodoRest ) ;
    public final void rule__ServicioRest__MetodoAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5181:1: ( ( ruleTipoMetodoRest ) )
            // InternalMyDsl.g:5182:2: ( ruleTipoMetodoRest )
            {
            // InternalMyDsl.g:5182:2: ( ruleTipoMetodoRest )
            // InternalMyDsl.g:5183:3: ruleTipoMetodoRest
            {
             before(grammarAccess.getServicioRestAccess().getMetodoTipoMetodoRestEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTipoMetodoRest();

            state._fsp--;

             after(grammarAccess.getServicioRestAccess().getMetodoTipoMetodoRestEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServicioRest__MetodoAssignment_0"


    // $ANTLR start "rule__ServicioRest__NameAssignment_1"
    // InternalMyDsl.g:5192:1: rule__ServicioRest__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__ServicioRest__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5196:1: ( ( ruleEString ) )
            // InternalMyDsl.g:5197:2: ( ruleEString )
            {
            // InternalMyDsl.g:5197:2: ( ruleEString )
            // InternalMyDsl.g:5198:3: ruleEString
            {
             before(grammarAccess.getServicioRestAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getServicioRestAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServicioRest__NameAssignment_1"


    // $ANTLR start "rule__ServicioRest__UrlAssignment_5"
    // InternalMyDsl.g:5207:1: rule__ServicioRest__UrlAssignment_5 : ( ruleUrl ) ;
    public final void rule__ServicioRest__UrlAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5211:1: ( ( ruleUrl ) )
            // InternalMyDsl.g:5212:2: ( ruleUrl )
            {
            // InternalMyDsl.g:5212:2: ( ruleUrl )
            // InternalMyDsl.g:5213:3: ruleUrl
            {
             before(grammarAccess.getServicioRestAccess().getUrlUrlParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleUrl();

            state._fsp--;

             after(grammarAccess.getServicioRestAccess().getUrlUrlParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServicioRest__UrlAssignment_5"


    // $ANTLR start "rule__ServicioRest__RequestAssignment_7"
    // InternalMyDsl.g:5222:1: rule__ServicioRest__RequestAssignment_7 : ( ruleRequest ) ;
    public final void rule__ServicioRest__RequestAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5226:1: ( ( ruleRequest ) )
            // InternalMyDsl.g:5227:2: ( ruleRequest )
            {
            // InternalMyDsl.g:5227:2: ( ruleRequest )
            // InternalMyDsl.g:5228:3: ruleRequest
            {
             before(grammarAccess.getServicioRestAccess().getRequestRequestParserRuleCall_7_0()); 
            pushFollow(FOLLOW_2);
            ruleRequest();

            state._fsp--;

             after(grammarAccess.getServicioRestAccess().getRequestRequestParserRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServicioRest__RequestAssignment_7"


    // $ANTLR start "rule__ServicioRest__ResponseAssignment_8"
    // InternalMyDsl.g:5237:1: rule__ServicioRest__ResponseAssignment_8 : ( ruleResponse ) ;
    public final void rule__ServicioRest__ResponseAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5241:1: ( ( ruleResponse ) )
            // InternalMyDsl.g:5242:2: ( ruleResponse )
            {
            // InternalMyDsl.g:5242:2: ( ruleResponse )
            // InternalMyDsl.g:5243:3: ruleResponse
            {
             before(grammarAccess.getServicioRestAccess().getResponseResponseParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleResponse();

            state._fsp--;

             after(grammarAccess.getServicioRestAccess().getResponseResponseParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ServicioRest__ResponseAssignment_8"


    // $ANTLR start "rule__Url__UrlexpresionsAssignment_1"
    // InternalMyDsl.g:5252:1: rule__Url__UrlexpresionsAssignment_1 : ( ruleUrlExpresion ) ;
    public final void rule__Url__UrlexpresionsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5256:1: ( ( ruleUrlExpresion ) )
            // InternalMyDsl.g:5257:2: ( ruleUrlExpresion )
            {
            // InternalMyDsl.g:5257:2: ( ruleUrlExpresion )
            // InternalMyDsl.g:5258:3: ruleUrlExpresion
            {
             before(grammarAccess.getUrlAccess().getUrlexpresionsUrlExpresionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleUrlExpresion();

            state._fsp--;

             after(grammarAccess.getUrlAccess().getUrlexpresionsUrlExpresionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Url__UrlexpresionsAssignment_1"


    // $ANTLR start "rule__StringType__TextAssignment_2"
    // InternalMyDsl.g:5267:1: rule__StringType__TextAssignment_2 : ( ruleEString ) ;
    public final void rule__StringType__TextAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5271:1: ( ( ruleEString ) )
            // InternalMyDsl.g:5272:2: ( ruleEString )
            {
            // InternalMyDsl.g:5272:2: ( ruleEString )
            // InternalMyDsl.g:5273:3: ruleEString
            {
             before(grammarAccess.getStringTypeAccess().getTextEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getStringTypeAccess().getTextEStringParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__StringType__TextAssignment_2"


    // $ANTLR start "rule__QueryParam__NameAssignment_2"
    // InternalMyDsl.g:5282:1: rule__QueryParam__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__QueryParam__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5286:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5287:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5287:2: ( RULE_ID )
            // InternalMyDsl.g:5288:3: RULE_ID
            {
             before(grammarAccess.getQueryParamAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQueryParamAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QueryParam__NameAssignment_2"


    // $ANTLR start "rule__PathParam__NameAssignment_1"
    // InternalMyDsl.g:5297:1: rule__PathParam__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__PathParam__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5301:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:5302:2: ( RULE_ID )
            {
            // InternalMyDsl.g:5302:2: ( RULE_ID )
            // InternalMyDsl.g:5303:3: RULE_ID
            {
             before(grammarAccess.getPathParamAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPathParamAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PathParam__NameAssignment_1"


    // $ANTLR start "rule__Response__TipoEntidadAssignment_4_0"
    // InternalMyDsl.g:5312:1: rule__Response__TipoEntidadAssignment_4_0 : ( ( RULE_ID ) ) ;
    public final void rule__Response__TipoEntidadAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5316:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5317:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5317:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5318:3: ( RULE_ID )
            {
             before(grammarAccess.getResponseAccess().getTipoEntidadEntidadCrossReference_4_0_0()); 
            // InternalMyDsl.g:5319:3: ( RULE_ID )
            // InternalMyDsl.g:5320:4: RULE_ID
            {
             before(grammarAccess.getResponseAccess().getTipoEntidadEntidadIDTerminalRuleCall_4_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getResponseAccess().getTipoEntidadEntidadIDTerminalRuleCall_4_0_0_1()); 

            }

             after(grammarAccess.getResponseAccess().getTipoEntidadEntidadCrossReference_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__TipoEntidadAssignment_4_0"


    // $ANTLR start "rule__Response__TipoPrimitivoAssignment_4_1"
    // InternalMyDsl.g:5331:1: rule__Response__TipoPrimitivoAssignment_4_1 : ( ruleTipoAtributo ) ;
    public final void rule__Response__TipoPrimitivoAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5335:1: ( ( ruleTipoAtributo ) )
            // InternalMyDsl.g:5336:2: ( ruleTipoAtributo )
            {
            // InternalMyDsl.g:5336:2: ( ruleTipoAtributo )
            // InternalMyDsl.g:5337:3: ruleTipoAtributo
            {
             before(grammarAccess.getResponseAccess().getTipoPrimitivoTipoAtributoEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTipoAtributo();

            state._fsp--;

             after(grammarAccess.getResponseAccess().getTipoPrimitivoTipoAtributoEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Response__TipoPrimitivoAssignment_4_1"


    // $ANTLR start "rule__Request__TipoEntidadAssignment_4_0"
    // InternalMyDsl.g:5346:1: rule__Request__TipoEntidadAssignment_4_0 : ( ( RULE_ID ) ) ;
    public final void rule__Request__TipoEntidadAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5350:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5351:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5351:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5352:3: ( RULE_ID )
            {
             before(grammarAccess.getRequestAccess().getTipoEntidadEntidadCrossReference_4_0_0()); 
            // InternalMyDsl.g:5353:3: ( RULE_ID )
            // InternalMyDsl.g:5354:4: RULE_ID
            {
             before(grammarAccess.getRequestAccess().getTipoEntidadEntidadIDTerminalRuleCall_4_0_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRequestAccess().getTipoEntidadEntidadIDTerminalRuleCall_4_0_0_1()); 

            }

             after(grammarAccess.getRequestAccess().getTipoEntidadEntidadCrossReference_4_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__TipoEntidadAssignment_4_0"


    // $ANTLR start "rule__Request__TipoPrimitivoAssignment_4_1"
    // InternalMyDsl.g:5365:1: rule__Request__TipoPrimitivoAssignment_4_1 : ( ruleTipoAtributo ) ;
    public final void rule__Request__TipoPrimitivoAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5369:1: ( ( ruleTipoAtributo ) )
            // InternalMyDsl.g:5370:2: ( ruleTipoAtributo )
            {
            // InternalMyDsl.g:5370:2: ( ruleTipoAtributo )
            // InternalMyDsl.g:5371:3: ruleTipoAtributo
            {
             before(grammarAccess.getRequestAccess().getTipoPrimitivoTipoAtributoEnumRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTipoAtributo();

            state._fsp--;

             after(grammarAccess.getRequestAccess().getTipoPrimitivoTipoAtributoEnumRuleCall_4_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Request__TipoPrimitivoAssignment_4_1"


    // $ANTLR start "rule__PrimitiveType__NameAssignment"
    // InternalMyDsl.g:5380:1: rule__PrimitiveType__NameAssignment : ( ruleTipoAtributo ) ;
    public final void rule__PrimitiveType__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5384:1: ( ( ruleTipoAtributo ) )
            // InternalMyDsl.g:5385:2: ( ruleTipoAtributo )
            {
            // InternalMyDsl.g:5385:2: ( ruleTipoAtributo )
            // InternalMyDsl.g:5386:3: ruleTipoAtributo
            {
             before(grammarAccess.getPrimitiveTypeAccess().getNameTipoAtributoEnumRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleTipoAtributo();

            state._fsp--;

             after(grammarAccess.getPrimitiveTypeAccess().getNameTipoAtributoEnumRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PrimitiveType__NameAssignment"


    // $ANTLR start "rule__Test__ServiceAssignment_6"
    // InternalMyDsl.g:5395:1: rule__Test__ServiceAssignment_6 : ( ( RULE_ID ) ) ;
    public final void rule__Test__ServiceAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5399:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:5400:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:5400:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:5401:3: ( RULE_ID )
            {
             before(grammarAccess.getTestAccess().getServiceServicioRestCrossReference_6_0()); 
            // InternalMyDsl.g:5402:3: ( RULE_ID )
            // InternalMyDsl.g:5403:4: RULE_ID
            {
             before(grammarAccess.getTestAccess().getServiceServicioRestIDTerminalRuleCall_6_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTestAccess().getServiceServicioRestIDTerminalRuleCall_6_0_1()); 

            }

             after(grammarAccess.getTestAccess().getServiceServicioRestCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__ServiceAssignment_6"


    // $ANTLR start "rule__Test__DescripcionAssignment_10"
    // InternalMyDsl.g:5414:1: rule__Test__DescripcionAssignment_10 : ( ruleEString ) ;
    public final void rule__Test__DescripcionAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5418:1: ( ( ruleEString ) )
            // InternalMyDsl.g:5419:2: ( ruleEString )
            {
            // InternalMyDsl.g:5419:2: ( ruleEString )
            // InternalMyDsl.g:5420:3: ruleEString
            {
             before(grammarAccess.getTestAccess().getDescripcionEStringParserRuleCall_10_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getTestAccess().getDescripcionEStringParserRuleCall_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__DescripcionAssignment_10"


    // $ANTLR start "rule__Test__MappingsAssignment_12_2"
    // InternalMyDsl.g:5429:1: rule__Test__MappingsAssignment_12_2 : ( ruleMapping ) ;
    public final void rule__Test__MappingsAssignment_12_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5433:1: ( ( ruleMapping ) )
            // InternalMyDsl.g:5434:2: ( ruleMapping )
            {
            // InternalMyDsl.g:5434:2: ( ruleMapping )
            // InternalMyDsl.g:5435:3: ruleMapping
            {
             before(grammarAccess.getTestAccess().getMappingsMappingParserRuleCall_12_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMapping();

            state._fsp--;

             after(grammarAccess.getTestAccess().getMappingsMappingParserRuleCall_12_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__MappingsAssignment_12_2"


    // $ANTLR start "rule__Test__AsertionsAssignment_15"
    // InternalMyDsl.g:5444:1: rule__Test__AsertionsAssignment_15 : ( ruleAsercion ) ;
    public final void rule__Test__AsertionsAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5448:1: ( ( ruleAsercion ) )
            // InternalMyDsl.g:5449:2: ( ruleAsercion )
            {
            // InternalMyDsl.g:5449:2: ( ruleAsercion )
            // InternalMyDsl.g:5450:3: ruleAsercion
            {
             before(grammarAccess.getTestAccess().getAsertionsAsercionParserRuleCall_15_0()); 
            pushFollow(FOLLOW_2);
            ruleAsercion();

            state._fsp--;

             after(grammarAccess.getTestAccess().getAsertionsAsercionParserRuleCall_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Test__AsertionsAssignment_15"


    // $ANTLR start "rule__Mapping__ParametroAssignment_2"
    // InternalMyDsl.g:5459:1: rule__Mapping__ParametroAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Mapping__ParametroAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5463:1: ( ( ( ruleQualifiedName ) ) )
            // InternalMyDsl.g:5464:2: ( ( ruleQualifiedName ) )
            {
            // InternalMyDsl.g:5464:2: ( ( ruleQualifiedName ) )
            // InternalMyDsl.g:5465:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getMappingAccess().getParametroParametroCrossReference_2_0()); 
            // InternalMyDsl.g:5466:3: ( ruleQualifiedName )
            // InternalMyDsl.g:5467:4: ruleQualifiedName
            {
             before(grammarAccess.getMappingAccess().getParametroParametroQualifiedNameParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getMappingAccess().getParametroParametroQualifiedNameParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getMappingAccess().getParametroParametroCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__ParametroAssignment_2"


    // $ANTLR start "rule__Mapping__AtributoAssignment_6_0_1"
    // InternalMyDsl.g:5478:1: rule__Mapping__AtributoAssignment_6_0_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__Mapping__AtributoAssignment_6_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5482:1: ( ( ( ruleQualifiedName ) ) )
            // InternalMyDsl.g:5483:2: ( ( ruleQualifiedName ) )
            {
            // InternalMyDsl.g:5483:2: ( ( ruleQualifiedName ) )
            // InternalMyDsl.g:5484:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getMappingAccess().getAtributoAtributoCrossReference_6_0_1_0()); 
            // InternalMyDsl.g:5485:3: ( ruleQualifiedName )
            // InternalMyDsl.g:5486:4: ruleQualifiedName
            {
             before(grammarAccess.getMappingAccess().getAtributoAtributoQualifiedNameParserRuleCall_6_0_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getMappingAccess().getAtributoAtributoQualifiedNameParserRuleCall_6_0_1_0_1()); 

            }

             after(grammarAccess.getMappingAccess().getAtributoAtributoCrossReference_6_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__AtributoAssignment_6_0_1"


    // $ANTLR start "rule__Mapping__DatoprimitivoAssignment_6_1"
    // InternalMyDsl.g:5497:1: rule__Mapping__DatoprimitivoAssignment_6_1 : ( ruleDatoPrimitivo ) ;
    public final void rule__Mapping__DatoprimitivoAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5501:1: ( ( ruleDatoPrimitivo ) )
            // InternalMyDsl.g:5502:2: ( ruleDatoPrimitivo )
            {
            // InternalMyDsl.g:5502:2: ( ruleDatoPrimitivo )
            // InternalMyDsl.g:5503:3: ruleDatoPrimitivo
            {
             before(grammarAccess.getMappingAccess().getDatoprimitivoDatoPrimitivoParserRuleCall_6_1_0()); 
            pushFollow(FOLLOW_2);
            ruleDatoPrimitivo();

            state._fsp--;

             after(grammarAccess.getMappingAccess().getDatoprimitivoDatoPrimitivoParserRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mapping__DatoprimitivoAssignment_6_1"


    // $ANTLR start "rule__Asercion__Elemento1Assignment_0_0"
    // InternalMyDsl.g:5512:1: rule__Asercion__Elemento1Assignment_0_0 : ( ruleElementoStatus ) ;
    public final void rule__Asercion__Elemento1Assignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5516:1: ( ( ruleElementoStatus ) )
            // InternalMyDsl.g:5517:2: ( ruleElementoStatus )
            {
            // InternalMyDsl.g:5517:2: ( ruleElementoStatus )
            // InternalMyDsl.g:5518:3: ruleElementoStatus
            {
             before(grammarAccess.getAsercionAccess().getElemento1ElementoStatusParserRuleCall_0_0_0()); 
            pushFollow(FOLLOW_2);
            ruleElementoStatus();

            state._fsp--;

             after(grammarAccess.getAsercionAccess().getElemento1ElementoStatusParserRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Elemento1Assignment_0_0"


    // $ANTLR start "rule__Asercion__Elemento1Assignment_0_1"
    // InternalMyDsl.g:5527:1: rule__Asercion__Elemento1Assignment_0_1 : ( ruleElementoResponse ) ;
    public final void rule__Asercion__Elemento1Assignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5531:1: ( ( ruleElementoResponse ) )
            // InternalMyDsl.g:5532:2: ( ruleElementoResponse )
            {
            // InternalMyDsl.g:5532:2: ( ruleElementoResponse )
            // InternalMyDsl.g:5533:3: ruleElementoResponse
            {
             before(grammarAccess.getAsercionAccess().getElemento1ElementoResponseParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_2);
            ruleElementoResponse();

            state._fsp--;

             after(grammarAccess.getAsercionAccess().getElemento1ElementoResponseParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Elemento1Assignment_0_1"


    // $ANTLR start "rule__Asercion__Elemento1Assignment_0_2_1"
    // InternalMyDsl.g:5542:1: rule__Asercion__Elemento1Assignment_0_2_1 : ( ruleElementoAtributo ) ;
    public final void rule__Asercion__Elemento1Assignment_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5546:1: ( ( ruleElementoAtributo ) )
            // InternalMyDsl.g:5547:2: ( ruleElementoAtributo )
            {
            // InternalMyDsl.g:5547:2: ( ruleElementoAtributo )
            // InternalMyDsl.g:5548:3: ruleElementoAtributo
            {
             before(grammarAccess.getAsercionAccess().getElemento1ElementoAtributoParserRuleCall_0_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleElementoAtributo();

            state._fsp--;

             after(grammarAccess.getAsercionAccess().getElemento1ElementoAtributoParserRuleCall_0_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Elemento1Assignment_0_2_1"


    // $ANTLR start "rule__Asercion__OperadorAssignment_1"
    // InternalMyDsl.g:5557:1: rule__Asercion__OperadorAssignment_1 : ( ruleOperador ) ;
    public final void rule__Asercion__OperadorAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5561:1: ( ( ruleOperador ) )
            // InternalMyDsl.g:5562:2: ( ruleOperador )
            {
            // InternalMyDsl.g:5562:2: ( ruleOperador )
            // InternalMyDsl.g:5563:3: ruleOperador
            {
             before(grammarAccess.getAsercionAccess().getOperadorOperadorEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOperador();

            state._fsp--;

             after(grammarAccess.getAsercionAccess().getOperadorOperadorEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__OperadorAssignment_1"


    // $ANTLR start "rule__Asercion__Elemento2Assignment_2_0"
    // InternalMyDsl.g:5572:1: rule__Asercion__Elemento2Assignment_2_0 : ( ruleElementoPrimitivo ) ;
    public final void rule__Asercion__Elemento2Assignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5576:1: ( ( ruleElementoPrimitivo ) )
            // InternalMyDsl.g:5577:2: ( ruleElementoPrimitivo )
            {
            // InternalMyDsl.g:5577:2: ( ruleElementoPrimitivo )
            // InternalMyDsl.g:5578:3: ruleElementoPrimitivo
            {
             before(grammarAccess.getAsercionAccess().getElemento2ElementoPrimitivoParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            ruleElementoPrimitivo();

            state._fsp--;

             after(grammarAccess.getAsercionAccess().getElemento2ElementoPrimitivoParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Elemento2Assignment_2_0"


    // $ANTLR start "rule__Asercion__Elemento2Assignment_2_1_1"
    // InternalMyDsl.g:5587:1: rule__Asercion__Elemento2Assignment_2_1_1 : ( ruleElementoParametro ) ;
    public final void rule__Asercion__Elemento2Assignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5591:1: ( ( ruleElementoParametro ) )
            // InternalMyDsl.g:5592:2: ( ruleElementoParametro )
            {
            // InternalMyDsl.g:5592:2: ( ruleElementoParametro )
            // InternalMyDsl.g:5593:3: ruleElementoParametro
            {
             before(grammarAccess.getAsercionAccess().getElemento2ElementoParametroParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleElementoParametro();

            state._fsp--;

             after(grammarAccess.getAsercionAccess().getElemento2ElementoParametroParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Asercion__Elemento2Assignment_2_1_1"


    // $ANTLR start "rule__ElementoStatus__TipoAssignment"
    // InternalMyDsl.g:5602:1: rule__ElementoStatus__TipoAssignment : ( ( 'response.status' ) ) ;
    public final void rule__ElementoStatus__TipoAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5606:1: ( ( ( 'response.status' ) ) )
            // InternalMyDsl.g:5607:2: ( ( 'response.status' ) )
            {
            // InternalMyDsl.g:5607:2: ( ( 'response.status' ) )
            // InternalMyDsl.g:5608:3: ( 'response.status' )
            {
             before(grammarAccess.getElementoStatusAccess().getTipoResponseStatusKeyword_0()); 
            // InternalMyDsl.g:5609:3: ( 'response.status' )
            // InternalMyDsl.g:5610:4: 'response.status'
            {
             before(grammarAccess.getElementoStatusAccess().getTipoResponseStatusKeyword_0()); 
            match(input,72,FOLLOW_2); 
             after(grammarAccess.getElementoStatusAccess().getTipoResponseStatusKeyword_0()); 

            }

             after(grammarAccess.getElementoStatusAccess().getTipoResponseStatusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementoStatus__TipoAssignment"


    // $ANTLR start "rule__ElementoResponse__TipoAssignment"
    // InternalMyDsl.g:5621:1: rule__ElementoResponse__TipoAssignment : ( ( 'response' ) ) ;
    public final void rule__ElementoResponse__TipoAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5625:1: ( ( ( 'response' ) ) )
            // InternalMyDsl.g:5626:2: ( ( 'response' ) )
            {
            // InternalMyDsl.g:5626:2: ( ( 'response' ) )
            // InternalMyDsl.g:5627:3: ( 'response' )
            {
             before(grammarAccess.getElementoResponseAccess().getTipoResponseKeyword_0()); 
            // InternalMyDsl.g:5628:3: ( 'response' )
            // InternalMyDsl.g:5629:4: 'response'
            {
             before(grammarAccess.getElementoResponseAccess().getTipoResponseKeyword_0()); 
            match(input,73,FOLLOW_2); 
             after(grammarAccess.getElementoResponseAccess().getTipoResponseKeyword_0()); 

            }

             after(grammarAccess.getElementoResponseAccess().getTipoResponseKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementoResponse__TipoAssignment"


    // $ANTLR start "rule__ElementoAtributo__AtributoAssignment"
    // InternalMyDsl.g:5640:1: rule__ElementoAtributo__AtributoAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__ElementoAtributo__AtributoAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5644:1: ( ( ( ruleQualifiedName ) ) )
            // InternalMyDsl.g:5645:2: ( ( ruleQualifiedName ) )
            {
            // InternalMyDsl.g:5645:2: ( ( ruleQualifiedName ) )
            // InternalMyDsl.g:5646:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getElementoAtributoAccess().getAtributoAtributoCrossReference_0()); 
            // InternalMyDsl.g:5647:3: ( ruleQualifiedName )
            // InternalMyDsl.g:5648:4: ruleQualifiedName
            {
             before(grammarAccess.getElementoAtributoAccess().getAtributoAtributoQualifiedNameParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getElementoAtributoAccess().getAtributoAtributoQualifiedNameParserRuleCall_0_1()); 

            }

             after(grammarAccess.getElementoAtributoAccess().getAtributoAtributoCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementoAtributo__AtributoAssignment"


    // $ANTLR start "rule__ElementoParametro__ParametroAssignment"
    // InternalMyDsl.g:5659:1: rule__ElementoParametro__ParametroAssignment : ( ( ruleQualifiedName ) ) ;
    public final void rule__ElementoParametro__ParametroAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5663:1: ( ( ( ruleQualifiedName ) ) )
            // InternalMyDsl.g:5664:2: ( ( ruleQualifiedName ) )
            {
            // InternalMyDsl.g:5664:2: ( ( ruleQualifiedName ) )
            // InternalMyDsl.g:5665:3: ( ruleQualifiedName )
            {
             before(grammarAccess.getElementoParametroAccess().getParametroParametroCrossReference_0()); 
            // InternalMyDsl.g:5666:3: ( ruleQualifiedName )
            // InternalMyDsl.g:5667:4: ruleQualifiedName
            {
             before(grammarAccess.getElementoParametroAccess().getParametroParametroQualifiedNameParserRuleCall_0_1()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getElementoParametroAccess().getParametroParametroQualifiedNameParserRuleCall_0_1()); 

            }

             after(grammarAccess.getElementoParametroAccess().getParametroParametroCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementoParametro__ParametroAssignment"


    // $ANTLR start "rule__ElementoPrimitivo__ElementoPrimitivoAssignment"
    // InternalMyDsl.g:5678:1: rule__ElementoPrimitivo__ElementoPrimitivoAssignment : ( ruleDatoPrimitivo ) ;
    public final void rule__ElementoPrimitivo__ElementoPrimitivoAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:5682:1: ( ( ruleDatoPrimitivo ) )
            // InternalMyDsl.g:5683:2: ( ruleDatoPrimitivo )
            {
            // InternalMyDsl.g:5683:2: ( ruleDatoPrimitivo )
            // InternalMyDsl.g:5684:3: ruleDatoPrimitivo
            {
             before(grammarAccess.getElementoPrimitivoAccess().getElementoPrimitivoDatoPrimitivoParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleDatoPrimitivo();

            state._fsp--;

             after(grammarAccess.getElementoPrimitivoAccess().getElementoPrimitivoDatoPrimitivoParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ElementoPrimitivo__ElementoPrimitivoAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x080405E000038000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0004040000000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000038002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000001E000000002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000100000038000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000001FFF800000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00F0000000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0500000000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x00F0000000000002L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0060000000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000038040L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0001000000000100L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0xC000000000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000100000000000L,0x0000000000000310L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000310L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0002000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000006070L,0x0000000000000008L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x00000000007C0000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000006070L,0x0000000000000028L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});

}