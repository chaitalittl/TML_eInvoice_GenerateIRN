<xsl:stylesheet version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	
	xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">


	<xsl:template match="/IRNInputResponse">
		 <soap:Envelope>			
			<soap:Body>
				<IRNInputResponse>
					
						<xsl:copy-of select="*" />
					
					
				</IRNInputResponse>
			</soap:Body>
		</soap:Envelope> 
		
		
	</xsl:template> 

</xsl:stylesheet>